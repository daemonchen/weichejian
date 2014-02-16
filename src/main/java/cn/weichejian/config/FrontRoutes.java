package cn.weichejian.config;

import cn.weichejian.web.controller.mainsite.AccountsController;
import cn.weichejian.web.controller.mainsite.IndexController;
import cn.weichejian.web.controller.wechat.WeChatController;

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
		add("/accounts", AccountsController.class);
	}

	private void admin() {
		add("/admin", IndexController.class);
	}
	
	private void wechat() {
		add("/api", WeChatController.class);
	}
}
