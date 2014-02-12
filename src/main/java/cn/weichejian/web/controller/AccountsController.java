package cn.weichejian.web.controller;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class AccountsController extends Controller {
	public void index(){
		List<User> users =  User.dao.find("select * from t_user where login_name=?", getPara("email"));
		User user = users.get(0);
		System.out.println(user.getStr("password"));
		if (getPara("password") == user.getStr("password")) {
			this.renderText("error"); //TODO render json after while
		}else{
			this.redirect("/index");
		}
	}
	public void login() {
		this.render("login.jsp");
	}
	public void signup() {
		this.render("signup.jsp");
	}
	public void signuppost() {
		//TODO
		/*
		 double md5 the pwd && return error when db save occur err
		 */
		new User().set("login_name", getPara("email")).set("password", getPara("password")).save();
		this.redirect("/index");
	}
}
