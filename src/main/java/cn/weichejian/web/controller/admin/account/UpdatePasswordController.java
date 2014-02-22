package cn.weichejian.web.controller.admin.account;


import java.util.Date;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;

public class UpdatePasswordController extends Controller{
	@Before(Restful.class)
	public void index(){
		render("/admin/updatePassword/index.jsp");
	}
	
	@ClearInterceptor(ClearLayer.ALL)
	public void save(){
		User user = getSessionAttr("loginUser");
		if(user == null){
			setAttr("failed", "请重新登录");
		}
		else{
			if(user.get("password").equals(getPara("o_password"))){
				Boolean result = user
					.set("password", getPara("n_password"))
					.set("modify_time", new Date().getTime())
					.update();
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
