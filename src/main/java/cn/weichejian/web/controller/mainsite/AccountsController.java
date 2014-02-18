package cn.weichejian.web.controller.mainsite;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class AccountsController extends Controller {
	public void index(){
		User user =  User.dao.findFirst("select * from t_user where login_name=?", getPara("email"));
		if (getPara("password").equals(user.getStr("password"))) {
			setSessionAttr("loginUser",user);
			this.redirect("/admin");
		}else{
			this.renderText("error"); //TODO render json after while
		}
	}
	public void login() {
		this.render("login.jsp");
	}
	public void signup() {
		this.render("signup.jsp");
	}
	public void passwordreset(){
		this.render("reset.jsp");
	}
	public void signuppost() {
		//TODO
		/*
		 double md5 the pwd && return error when db save occur err
		 */
		new User().set("login_name", getPara("email")).set("password", getPara("password")).save();
		User user =  User.dao.findFirst("select * from t_user where login_name=?", getPara("email"));
		setSessionAttr("loginUser",user);
		this.redirect("/admin");
	}
}
