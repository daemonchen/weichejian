package cn.weichejian.web.controller.mainsite;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cn.weichejian.model.LoginLog;
import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class AccountsController extends Controller {
	public void index(){
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
	
	public void login() {
		this.render("login.jsp");
	}
	public void signup() {
		this.render("signup.jsp");
	}
	public void passwordreset(){
		this.render("reset.jsp");
	}
	public void signuppost() {//注册
		//TODO
		/*
		 double md5 the pwd && return error when db save occur err
		 */
		new User().set("login_name", getPara("email"))
		.set("password", getPara("password"))
		.set("reg_time", new Date())
		.save();
		User user =  User.dao.findFirst("select * from t_user where login_name=?", getPara("email"));
		setSessionAttr("loginUser",user);
		this.redirect("/admin");
	}
	
	public void signout(){
		setSessionAttr("loginUser",null);
		this.redirect("/");
	}
}
