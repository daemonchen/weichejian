package cn.weichejian.model;

import com.jfinal.plugin.activerecord.Model;

public class User extends Model<User> {
	private static final long serialVersionUID = -1236046693178618958L;
	public static final User dao = new User();
}
