package cn.weichejian.model;

import com.jfinal.plugin.activerecord.Model;

public class MpAccount extends Model<MpAccount>{
	private static final long serialVersionUID = -1236046693178618958L;
	public static final MpAccount dao = new MpAccount();
	
	public User getUser(){
		return User.dao.findById(get("user_id"));
	}

}
