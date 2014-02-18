package cn.weichejian.web.controller.mainsite;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class IndexController extends Controller {
	public void index() {
		this.setAttr("controllerName", "index");
		User user = getSessionAttr("loginUser");
		if(user != null){
			this.setAttr("user", user.get("login_name"));
		}
		else{
			this.setAttr("user", null);
		}
		this.render("/index/index.jsp");
//		List<User> users = User.dao.find("select * from t_user where id=?", 10);
//		Page<User> userPage = User.dao.paginate(1, 10, "select * ", "from t_mem_member where 1=1");
//		System.out.println(userPage.getTotalPage());
//		for(User user : users) {
//			System.out.println(user.get("email"));
//		}
	}
}
