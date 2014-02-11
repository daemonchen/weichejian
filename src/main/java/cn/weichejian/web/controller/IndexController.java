package cn.weichejian.web.controller;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class IndexController extends Controller {
	public void index() {
		this.setAttr("test", new String[]{"ji"});
//		 response.setCharacterEncoding("utf-8");
		this.render("index.jsp");
		List<User> users = User.dao.find("select * from t_user where id=?", 10);
//		new User().set("login_name", "cgyqqcgy").set("password", "00o0o00oo00o0o").save();
//		User user1 = User.dao.findById(105);
//		System.out.println(user1.get("email"));
//		System.out.println(users.size());
		
//		Page<User> userPage = User.dao.paginate(1, 10, "select * ", "from t_mem_member where 1=1");
//		System.out.println(userPage.getTotalPage());
//		for(User user : users) {
//			System.out.println(user.get("email"));
//		}
	}
}
