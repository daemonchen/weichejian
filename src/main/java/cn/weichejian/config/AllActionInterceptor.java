package cn.weichejian.config;

import cn.weichejian.model.User;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;
import com.jfinal.core.Controller;



public class AllActionInterceptor implements Interceptor {
	public void intercept(ActionInvocation ai){
		Controller currentController = ai.getController();
		String controllerKey = ai.getControllerKey();
		String actionName = ai.getMethodName();
		currentController.setSessionAttr("controllerName", controllerKey);
		currentController.setSessionAttr("actionName", actionName);
		setUerName(currentController);
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
