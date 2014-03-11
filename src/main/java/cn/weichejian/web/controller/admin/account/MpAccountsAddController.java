package cn.weichejian.web.controller.admin.account;

import java.util.Date;

import cn.weichejian.model.MpAccount;
import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;

public class MpAccountsAddController extends Controller {
	@Before(Restful.class)
	public void index(){
		this.render("/admin/accounts/mp/add.jsp");
		//TODO display user info in index.jsp
	}
	@ClearInterceptor(ClearLayer.ALL)
	public void save(){
		//TODO 把form提交改为ajax
		User user = getSessionAttr("loginUser");
		try {
			// TODO 做去重检查
			new MpAccount().set("user_id", user.get("id"))
				.set("mp_account_name", getPara("mp_account_name"))
				.set("mp_type", getPara("mp_type"))
				.set("create_time", new Date().getTime())
				.save();
			//激活当前微信账号
			MpAccount mpAccount = MpAccount.dao.findFirst("");
			user.set("mp_account_id",mpAccount.get("id"))
			.set("modify_time", new Date().getTime())
			.update();
			redirect("/admin");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
}
