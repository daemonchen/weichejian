package cn.weichejian.web.controller.admin;

import java.util.List;

import cn.weichejian.model.User;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;

public class AdminController extends Controller {
	public void index(){
		this.render("index.jsp");
	}
}
