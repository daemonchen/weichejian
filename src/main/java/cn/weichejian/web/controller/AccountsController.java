package cn.weichejian.web.controller;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class AccountsController extends Controller {
	public void index(){
		this.render("login.jsp");
	}
	public void login() {
		this.render("login.jsp");
	}
}
