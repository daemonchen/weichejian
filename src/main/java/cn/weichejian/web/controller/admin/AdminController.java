package cn.weichejian.web.controller.admin;

import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.aop.Before;

public class AdminController extends Controller {
	public void logout(){
		setSessionAttr("loginUser",null);
		this.redirect("/");
	}
	@Before(Restful.class)
	public void index(){
		this.render("/admin/index/index.jsp");
		//TODO display user info in index.jsp
	}
	
}
