package cn.weichejian.web.controller.mainsite;

import java.util.Date;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.aop.Before;

public class RegisterController extends Controller {
	@Before(Restful.class)
	public void index(){
		this.render("/accounts/register/index.jsp");
	}
	public void save(){
		// TODO double md5 the pwd && return error when db save occur err
		new User().set("login_name", getPara("username"))
		.set("password", getPara("password"))
		.set("reg_time", new Date().getTime())
		.save();
		User user =  User.dao.findFirst("select * from t_user where login_name=?", getPara("username"));
		setSessionAttr("loginUser",user);
		this.redirect("/admin");
	}
}
