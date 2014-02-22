package cn.weichejian.web.controller.mainsite;

import java.util.Date;

import cn.weichejian.model.LoginLog;
import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.aop.Before;

public class LoginController extends Controller{
	@Before(Restful.class)
	public void index() {
		this.render("/accounts/login/index.jsp");
	}
	public void save(){
		User user =  User.dao.findFirst("select * from t_user where login_name=?", getPara("email"));
		if (getPara("password").equals(user.getStr("password"))) {
			setSessionAttr("loginUser",user);
			this.redirect("/admin");
			doLoginLog(user);
		}else{
			this.renderText("error"); //TODO render json after while
		}
	}
	private void doLoginLog(User user){
		try {
			new LoginLog().set("user_id",user.get("id"))
			.set("login_time", new Date())
			.set("ip",getRequest().getRemoteAddr())
			.save();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}