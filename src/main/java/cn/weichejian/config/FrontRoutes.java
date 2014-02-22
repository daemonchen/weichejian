package cn.weichejian.config;

import cn.weichejian.web.controller.admin.AdminController;
import cn.weichejian.web.controller.mainsite.IndexController;
import cn.weichejian.web.controller.mainsite.LoginController;
import cn.weichejian.web.controller.mainsite.RegisterController;
import cn.weichejian.web.controller.mainsite.ResetController;
import cn.weichejian.web.controller.wechat.WeChatController;
import cn.weichejian.web.controller.admin.account.MpAccountsController;

import com.jfinal.config.Routes;

public class FrontRoutes extends Routes {

	@Override
	public void config() {
		this.mainsite();
		this.admin();
		this.wechat();
	}

	private void mainsite() {
		add("/", IndexController.class);
		add("/login",LoginController.class);
		add("/register",RegisterController.class);
		add("/reset",ResetController.class);
	}

	private void admin() {
		add("/admin", AdminController.class);
		add("/admin/mpinfo", MpAccountsController.class);
//		add("/admin", SettingsController.class);
	}
	
	private void wechat() {
		add("/api", WeChatController.class);
	}
}
