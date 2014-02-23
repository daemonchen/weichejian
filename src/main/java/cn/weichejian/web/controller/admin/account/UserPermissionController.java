package cn.weichejian.web.controller.admin.account;

import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.aop.Before;

public class UserPermissionController extends Controller {
	@Before(Restful.class)
	public void index(){
		render("/admin/accounts/permission/index.jsp");
	}
}
