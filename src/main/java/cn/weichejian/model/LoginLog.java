package cn.weichejian.model;

import com.jfinal.plugin.activerecord.Model;

public class LoginLog extends Model<LoginLog> {
	private static final long serialVersionUID = -1236046693178618958L;
	public static final LoginLog dao = new LoginLog();
	
	public User getUser(){
		return User.dao.findById(get("user_id"));
	}
}
