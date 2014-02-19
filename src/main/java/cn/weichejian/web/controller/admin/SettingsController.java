package cn.weichejian.web.controller.admin;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

/*对应管理后台账号设置的controller
 * 其他的一级菜单，要写在独立controller里
 * */

public class SettingsController extends Controller {
	public void index(){
		this.setAttr("controllerName", "nothing");
		this.setAttr("actionName", "nothing");
		this.render("index.jsp");
	}
	public void mp_info(){
		this.setAttr("controllerName", "settings");//TODO set this controller in interceptor
		this.setAttr("actionName", "mp_info");
		//TODO if user has bind already,show user info page
		this.render("bind_mp.jsp");
	}
	public void bind_mp(){
		//TODO 把form提交改为ajax
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
	public void show_change_pwd(){
		this.setAttr("controllerName", "settings");
		this.setAttr("actionName", "show_change_pwd");
		render("change_pwd.jsp");
	}
	public void change_pwd(){
		User user = getSessionAttr("loginUser");
		if(user == null){
			setAttr("failed", "请重新登录");
		}
		else{
			if(user.get("password").equals(getPara("o_password"))){
				Boolean result = user.set("password", getPara("n_password")).update();
				if (result) {
					setAttr("success", "更新成功");
				} else{
					setAttr("failed", "更新失败");
				}
			} else {
				setAttr("failed", "原密码错误，请重新输入");
			}
			
		}
		renderJson();
	}
}
