package cn.weichejian.config;

import cn.weichejian.model.User;
import cn.weichejian.web.controller.HelloController;
import cn.weichejian.web.controller.TextController;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.wall.WallFilter;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.plugin.druid.DruidStatViewHandler;
import com.jfinal.render.ViewType;

//public class FrontRoutes extends Routes {
//	public void config() {
//		add("/", IndexController.class);
//		add("/blog", BlogController.class);
//		}
//}
public class SystemConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}

	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
		me.add("/text", TextController.class);
	}

	public void configPlugin(Plugins me) {
		loadPropertyFile("system.properties");

		DruidPlugin dp = new DruidPlugin(getProperty("jdbcUrl"),
				getProperty("user"), getProperty("password"));
		dp.addFilter(new StatFilter());
		WallFilter wall = new WallFilter();
		wall.setDbType("mysql");
		dp.addFilter(wall);
		me.add(dp);
		// ActiveRecordPlugin
		ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
		arp.setContainerFactory(new CaseInsensitiveContainerFactory(true));
		arp.addMapping("t_mem_member", User.class);
		me.add(arp);
	}

	public void configInterceptor(Interceptors me) {
	}

	public void configHandler(Handlers me) {
		DruidStatViewHandler dvh = new DruidStatViewHandler("/druid");
		me.add(dvh);
	}
}
