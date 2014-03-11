package cn.weichejian.web.controller.wechat;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.standard.MediaSize.Other;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;

import org.jdom.JDOMException;

import cn.weichejian.model.AutoReplySetting;
import cn.weichejian.model.User;

import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.wechat.sdk.WeiXin;
import com.wechat.sdk.vo.recv.WxRecvEventMsg;
import com.wechat.sdk.vo.recv.WxRecvMsg;
import com.wechat.sdk.vo.recv.WxRecvTextMsg;
import com.wechat.sdk.vo.send.WxSendMsg;
import com.wechat.sdk.vo.send.WxSendMusicMsg;
import com.wechat.sdk.vo.send.WxSendNewsMsg;
import com.wechat.sdk.vo.send.WxSendTextMsg;

public class WeChatController extends Controller {

	final String TOKEN = "weichejian";
	
	@ClearInterceptor(ClearLayer.ALL)
	public void index() {
		String urlPara = this.getPara(0);
		//因为要使用urlPara，所以这里不能使用restful接口
		//TODO make sure this user doesn't bind weixin yet;
		String signature = this.getPara("signature");
		String timestamp = this.getPara("timestamp");
		String nonce = this.getPara("nonce");
		String echostr = this.getPara("echostr");
		
		if(null != timestamp && null != nonce && null != echostr && null != signature) {
			if(WeiXin.access(TOKEN, signature, timestamp, nonce)) {
				this.renderText(echostr);
				return ;
			}
		}
		else{
			this.handlePostRequest(urlPara);
		}
		
		
	}
	private void handlePostRequest(String userId){
		try {
			ServletInputStream req = getRequest().getInputStream();
			ServletOutputStream res = getResponse().getOutputStream();
			WxRecvMsg msg = WeiXin.recv(req);
			WxSendMsg sendMsg = WeiXin.builderSendByRecv(msg);
			User user = User.dao.findById(userId);
			//TODO use map instead of if else stuff
			if(msg instanceof WxRecvEventMsg) {
				this.handleEventMsg(msg, sendMsg, user, res);
			}
			
			if(msg instanceof WxRecvTextMsg) {
				this.handleKeyWordTextMsg(msg, sendMsg, user, res);
				
			}  else {//TODO
				String content = "1. 菜单\n2.音乐\n,3.图文\n";
				sendMsg = new WxSendTextMsg(sendMsg, content);
				WeiXin.send(sendMsg, getResponse().getOutputStream());
				return;
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void handleEventMsg(WxRecvMsg msg, 
			WxSendMsg sendMsg,
			User user,
			ServletOutputStream res) throws JDOMException, IOException{
		WxRecvEventMsg m = (WxRecvEventMsg) msg;
		String event = m.getEvent();
		if("subscribe".equals(event)) {
			String sql = "select * from t_auto_reply_setting where user_id=? and mp_account_id=? and reply_type=1";
			String content = AutoReplySetting.dao
					.findFirst(sql,user.get("id"),user.get("mp_account_id"))
					.get("content");
			sendMsg = new WxSendTextMsg(sendMsg, content);
			WeiXin.send(sendMsg, res);
		}
	}
	
	private void handleKeyWordTextMsg(WxRecvMsg msg,
			WxSendMsg sendMsg,
			User user,
			ServletOutputStream res) throws JDOMException, IOException{
//		String sql = "select * from t_auto_reply_setting where user_id=? and mp_account_id=? and reply_type=1";
		WxRecvTextMsg m = (WxRecvTextMsg) msg;
		String text = m.getContent();
		if(null != text) 
			text = text.trim();
		int msgType = this.getResMsgType();
		/*TODO select key_words from t_auto_reply_setting where user_id=userId, 
		 * and check the result contain text from request, 
		otherwise return default content as reply_type is 2.*/
		switch (msgType) {
		case 1:
			String content = "1. 菜单\n2.音乐\n,3.图文\n";
			sendMsg = new WxSendTextMsg(sendMsg, content);
			break;
		case 2:
			sendMsg = new WxSendMusicMsg(sendMsg, "夜夜夜夜","林志颖",
					"http://hugemaxiao.co/COFFdD0xMzY1Njg5NTIyJmk9MTIxLjM0LjMxLjMmdT1Tb25ncy92MS9mYWludFFDLzQ3LzkxMGFlM2JjMzM5MDNlZGI3NmY3MDUzY2ZjZDI1YjQ3Lm1wMyZtPTMzMWQwNGY2YTNkNTRiNTMwYzc1MjhkN2FmNDRhMGZjJnY9ZG93biZuPdK50rnSudK5JnM9wdbWvuzFJnA9cw==.mp3", 
					"http://hugemaxiao.co/COFFdD0xMzY1Njg5NTIyJmk9MTIxLjM0LjMxLjMmdT1Tb25ncy92MS9mYWludFFDLzQ3LzkxMGFlM2JjMzM5MDNlZGI3NmY3MDUzY2ZjZDI1YjQ3Lm1wMyZtPTMzMWQwNGY2YTNkNTRiNTMwYzc1MjhkN2FmNDRhMGZjJnY9ZG93biZuPdK50rnSudK5JnM9wdbWvuzFJnA9cw==.mp3");
			break;
		case 3:
			sendMsg = new WxSendNewsMsg(sendMsg)
			.addItem("图片4", "描述4", "http://g.hiphotos.baidu.com/album/w%3D230/sign=b2b8791418d8bc3ec60801c9b28ba6c8/1ad5ad6eddc451da5ff2c0c5b7fd5266d016329c.jpg", "http://www.oschina.net")
			.addItem("图片1", "描述1", "http://a.hiphotos.baidu.com/album/w%3D230/sign=67afac3d242dd42a5f0906a8333a5b2f/8c1001e93901213f088bb78855e736d12f2e952e.jpg", "http://www.google.com")
			.addItem("图片2", "描述2", "http://e.hiphotos.baidu.com/album/w%3D230/sign=5254e9265243fbf2c52ca120807eca1e/77c6a7efce1b9d1669f2564ff2deb48f8c5464e3.jpg", "http://www.baidu.com")
			.addItem("图片3", "描述3", "http://d.hiphotos.baidu.com/album/w%3D230/sign=c3b3fe3aaa18972ba33a07c9d6cc7b9d/3812b31bb051f81995bdc164dbb44aed2e73e700.jpg", "http://www.sina.com")
			;
			break;
		default:
			break;
		}
		WeiXin.send(sendMsg, res);
		return;
	}
	
	private int getResMsgType(){
		//TODO select message_type from t_auto_reply_setting where user_id=userId and key_words=keywords 
		return 2;
	}
}
