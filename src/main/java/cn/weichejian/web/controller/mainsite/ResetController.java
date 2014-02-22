package cn.weichejian.web.controller.mainsite;

import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.aop.Before;

public class ResetController extends Controller {
	@Before(Restful.class)
	public void index(){
		this.render("/accounts/reset/index.jsp");
	}
	
	public void save(){
		setSessionAttr("loginUser",null);
		this.redirect("/");
	}
}
