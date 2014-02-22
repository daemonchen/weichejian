package cn.weichejian.web.controller.admin.account;

import java.util.List;

import cn.weichejian.model.MpAccount;
import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.aop.Before;

public class MpAccountsInfoController extends Controller {
	@Before(Restful.class)
	public void index(){
		User user = getSessionAttr("loginUser");
		if (user == null) {
			this.redirect("/login");
		}else{
			
			List<MpAccount> mpAccounts = MpAccount.dao.find("select * from t_mp_account where user_id=?",user.get("id"));
			if (mpAccounts.size() != 0) {
				this.setSessionAttr("mpAccounts", mpAccounts);
				this.render("/admin/accounts/mp/index.jsp");
			} else {
				this.redirect("/admin/mpadd");
			}
		}
		
		//TODO display user info in index.jsp
	}
	public void update(){
		//TODO update app_id app_secret modify_time
	}

}
