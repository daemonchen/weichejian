package cn.weichejian.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;

public class User extends Model<User> {
	private static final long serialVersionUID = -1236046693178618958L;
	public static final User dao = new User();
	
	public List<LoginLog> getLoginLogs(){
		return LoginLog.dao.find("select * from t_login_log where user_id=?",get("id"));
	}
}
