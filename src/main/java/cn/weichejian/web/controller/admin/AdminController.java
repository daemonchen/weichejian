package cn.weichejian.web.controller.admin;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class AdminController extends Controller {
	public void index(){
		this.render("index.jsp");
	}
	public void mp_info(){
		this.render("bind_mp.jsp");
	}
	public void bind_mp(){
		User user = getSessionAttr("loginUser");
		Boolean result;
		try {
			result = user.set("mp_account", getPara("mp_account"))
					.set("mp_account_name", getPara("mp_account_name"))
					.set("mp_type", getPara("mp_type"))
					.update();
			if(result){
				redirect("/admin");
			}else{
				renderText("db error");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
//		System.out.println(getPara("mp_type")); 
	}
}
