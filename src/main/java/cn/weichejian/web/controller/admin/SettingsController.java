package cn.weichejian.web.controller.admin;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

/*对应管理后台账号设置的controller
 * 其他的一级菜单，要写在独立controller里
 * */

public class SettingsController extends Controller {
	
	public void show_change_pwd(){
		render("change_pwd.jsp");
	}
	@ClearInterceptor(ClearLayer.ALL)
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
