package cn.weichejian.web.controller.wechat;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.jdom.JDOMException;

import com.jfinal.core.Controller;
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

	public void index() {
		String signature = getPara("signature");
		String timestamp = getPara("timestamp");
		String nonce = getPara("nonce");
		String echostr = getPara("echostr");
		
		renderNull();
		if(null != timestamp && null != nonce && null != echostr && null != signature) {
			if(WeiXin.access(TOKEN, signature, timestamp, nonce)) {
				renderHtml(echostr);
				return;
			}
			return;
		}
		
		try {
			WxRecvMsg msg = WeiXin.recv(getRequest().getInputStream());
			WxSendMsg sendMsg = WeiXin.builderSendByRecv(msg);
			
			if(msg instanceof WxRecvEventMsg) {
				WxRecvEventMsg m = (WxRecvEventMsg) msg;
				String event = m.getEvent();
				if("subscribe".equals(event)) {
					String content = "感谢关注";
					sendMsg = new WxSendTextMsg(sendMsg, content);
					WeiXin.send(sendMsg, getResponse().getOutputStream());
				}
			}
			
			if(msg instanceof WxRecvTextMsg) {
				WxRecvTextMsg m = (WxRecvTextMsg) msg;
				
				String text = m.getContent();
				if(null != text) 
					text = text.trim();
				
				Set<String> keyworkds = new HashSet<String>();
				keyworkds.add("1");
				keyworkds.add("菜单");
				keyworkds.add("menu");
				
				
				if(keyworkds.contains(text)) {
					String content = "1. 菜单\n2.音乐\n,3.图文\n";
					sendMsg = new WxSendTextMsg(sendMsg, content);
					
				} else if("2".equals(text)) {
					sendMsg = new WxSendMusicMsg(sendMsg, "夜夜夜夜","林志�",
							"http://hugemaxiao.co/COFFdD0xMzY1Njg5NTIyJmk9MTIxLjM0LjMxLjMmdT1Tb25ncy92MS9mYWludFFDLzQ3LzkxMGFlM2JjMzM5MDNlZGI3NmY3MDUzY2ZjZDI1YjQ3Lm1wMyZtPTMzMWQwNGY2YTNkNTRiNTMwYzc1MjhkN2FmNDRhMGZjJnY9ZG93biZuPdK50rnSudK5JnM9wdbWvuzFJnA9cw==.mp3", 
							"http://hugemaxiao.co/COFFdD0xMzY1Njg5NTIyJmk9MTIxLjM0LjMxLjMmdT1Tb25ncy92MS9mYWludFFDLzQ3LzkxMGFlM2JjMzM5MDNlZGI3NmY3MDUzY2ZjZDI1YjQ3Lm1wMyZtPTMzMWQwNGY2YTNkNTRiNTMwYzc1MjhkN2FmNDRhMGZjJnY9ZG93biZuPdK50rnSudK5JnM9wdbWvuzFJnA9cw==.mp3");
				} else if("3".equals(text)) {
					sendMsg = new WxSendNewsMsg(sendMsg)
					.addItem("图片4", "描述4", "http://g.hiphotos.baidu.com/album/w%3D230/sign=b2b8791418d8bc3ec60801c9b28ba6c8/1ad5ad6eddc451da5ff2c0c5b7fd5266d016329c.jpg", "http://www.oschina.net")
					.addItem("图片1", "描述1", "http://a.hiphotos.baidu.com/album/w%3D230/sign=67afac3d242dd42a5f0906a8333a5b2f/8c1001e93901213f088bb78855e736d12f2e952e.jpg", "http://www.google.com")
					.addItem("图片2", "描述2", "http://e.hiphotos.baidu.com/album/w%3D230/sign=5254e9265243fbf2c52ca120807eca1e/77c6a7efce1b9d1669f2564ff2deb48f8c5464e3.jpg", "http://www.baidu.com")
					.addItem("图片3", "描述3", "http://d.hiphotos.baidu.com/album/w%3D230/sign=c3b3fe3aaa18972ba33a07c9d6cc7b9d/3812b31bb051f81995bdc164dbb44aed2e73e700.jpg", "http://www.sina.com")
					;
				}  else {
					String content = "1. 菜单\n2.音乐\n,3.图文\n";
					sendMsg = new WxSendTextMsg(sendMsg, content);
				}
				WeiXin.send(sendMsg, getResponse().getOutputStream());
				return;
			}  else {
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
}
