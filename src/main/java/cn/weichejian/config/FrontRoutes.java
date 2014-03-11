package cn.weichejian.config;

import cn.weichejian.web.controller.admin.AdminController;
import cn.weichejian.web.controller.mainsite.IndexController;
import cn.weichejian.web.controller.mainsite.LoginController;
import cn.weichejian.web.controller.mainsite.RegisterController;
import cn.weichejian.web.controller.mainsite.ResetController;
import cn.weichejian.web.controller.wechat.WeChatController;
import cn.weichejian.web.controller.admin.account.MpAccountsAddController;
import cn.weichejian.web.controller.admin.account.MpAccountsInfoController;
import cn.weichejian.web.controller.admin.account.UpdatePasswordController;
import cn.weichejian.web.controller.admin.account.UserInfoController;
import cn.weichejian.web.controller.admin.account.UserPermissionController;
import cn.weichejian.web.controller.admin.modules.KeyWordsController;
import cn.weichejian.web.controller.admin.modules.WelcomeController;
import cn.weichejian.web.controller.admin.mpsites.MpsitesFoundationController;

import com.jfinal.config.Routes;

public class FrontRoutes extends Routes {

	@Override
	public void config() {
		this.mainsite();
		this.admin();
		this.wechat();
		this.module();
		this.mpsite();
	}

	private void mainsite() {
		add("/", IndexController.class);
		add("/login",LoginController.class);
		add("/register",RegisterController.class);
		add("/reset",ResetController.class);
	}

	private void admin() {
		add("/admin/permission", UserPermissionController.class);
		add("/admin/userinfo", UserInfoController.class);
		add("/admin/mpadd", MpAccountsAddController.class);
		add("/admin/mpinfo", MpAccountsInfoController.class);
		add("/admin/updatePassword", UpdatePasswordController.class);
		add("/admin", AdminController.class);
	}
	
	private void module(){
		add("/modules/welcome", WelcomeController.class);
		add("/modules/keywords", KeyWordsController.class);
	}
	
	private void mpsite(){
		add("/mpsites/foundation", MpsitesFoundationController.class);
	}
	private void wechat() {
		add("/api", WeChatController.class);
	}
}
