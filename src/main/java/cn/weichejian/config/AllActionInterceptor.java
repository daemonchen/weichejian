package cn.weichejian.config;

import cn.weichejian.model.User;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;
import com.jfinal.core.Controller;

public class AllActionInterceptor implements Interceptor {
	public void intercept(ActionInvocation ai){
		ai.getController().setSessionAttr("controllerName", ai.getControllerKey());
		setUerName(ai.getController());
		ai.invoke();
	}
	
	private void setUerName(Controller c){
		
		User user = c.getSessionAttr("loginUser");
		if(user != null){
			c.setSessionAttr("user", user.get("login_name"));
		}
		else{
			c.setSessionAttr("user", null);
		}
	}
	
}
