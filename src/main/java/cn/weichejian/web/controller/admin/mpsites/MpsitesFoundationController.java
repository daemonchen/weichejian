package cn.weichejian.web.controller.admin.mpsites;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.aop.Before;

public class MpsitesFoundationController extends Controller {
	@Before(Restful.class)
	public void index(){
		User user = getSessionAttr("loginUser");
		if (user == null) {
			this.redirect("/login");
		}else{
			this.render("/admin/mpsites/foundation/index.jsp");
		}
	}
}

