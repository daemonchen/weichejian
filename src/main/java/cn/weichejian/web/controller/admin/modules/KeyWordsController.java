package cn.weichejian.web.controller.admin.modules;

import java.util.Date;

import cn.weichejian.model.AutoReplySetting;
import cn.weichejian.model.User;

import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;

public class KeyWordsController extends Controller {
	@Before(Restful.class)
	public void index(){
		User user = getSessionAttr("loginUser");
		if (user == null) {
			this.redirect("/login");
		}else{
//			TODO select content from t_auto_reply_setting where user_id=? and mp_account_id=? and reply_type=1
			this.render("/admin/modules/keyWords/index.jsp");
		}
	}
	
	@ClearInterceptor(ClearLayer.ALL)
	public void save(){
		User user = getSessionAttr("loginUser");
		if(user == null){
			setAttr("failed", "请重新登录");
			renderJson();
			return;
		}
		boolean error = this.saveAutoReplySetting(user);
		if (error) {
			setAttr("success", "更新成功");
		} else{
			setAttr("failed", "更新失败");
		}
		
		renderJson();
	}
	
	@ClearInterceptor(ClearLayer.ALL)
	public void update(){
		//TODO update autoReplySetting
	}
	
	private boolean saveAutoReplySetting(User user){
		//TODO add rule_name field in t_auto_reply_setting table
		boolean result = new AutoReplySetting()
		.set("user_id", user.get("id"))
		.set("mp_account_id", user.get("mp_account_id"))
		.set("reply_type",3)
		.set("key_words", this.getPara("key_words"))
		.set("content", this.getPara("content"))
		.set("message_type",this.getPara("message_type"))
		.set("create_time",new Date().getTime())
		.save();
		return result;
	}
}
