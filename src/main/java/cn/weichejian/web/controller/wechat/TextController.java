package cn.weichejian.web.controller.wechat;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class TextController extends Controller {
	public void index() {
		this.render("index.jsp");
	}
	
	public void text(){
		this.renderText("text resultºº×Ö");
	}
}
