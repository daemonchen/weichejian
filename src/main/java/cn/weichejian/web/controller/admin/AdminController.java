package cn.weichejian.web.controller.admin;

import java.util.List;

import cn.weichejian.model.MpAccount;
import cn.weichejian.model.User;

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
		User user = getSessionAttr("loginUser");
		List<MpAccount> mpAccounts = MpAccount.dao.find("select * from t_mp_account where user_id=?",user.get("id"));
		if (mpAccounts.size() != 0) {
			this.redirect("/admin/mpinfo");
		} else {

			this.redirect("/admin/mpadd");
		}
	}
	
}
