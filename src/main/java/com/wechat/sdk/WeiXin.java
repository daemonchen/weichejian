package com.wechat.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.codec.digest.DigestUtils;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.output.XMLOutputter;

import com.wechat.sdk.parser.WxMsgKit;
import com.wechat.sdk.vo.recv.WxRecvMsg;
import com.wechat.sdk.vo.send.WxSendMsg;

public final class WeiXin {
	public static boolean access(String token, String signature,
			String timestamp, String nonce) {
		String[] dataStrings = new String[] { token, timestamp, nonce };
		Arrays.sort(dataStrings);
		String data = dataStrings[0] + dataStrings[1] + dataStrings[2];
		@SuppressWarnings("deprecation")
		String flag = DigestUtils.shaHex(data);
		if (flag.equalsIgnoreCase(signature)) {
			return true;
		} else {
			return false;
		}
	}

	public static WxRecvMsg recv(InputStream in) throws JDOMException,
			IOException {
		return WxMsgKit.parse(in);
	}

	public static void send(WxSendMsg msg, OutputStream out)
			throws JDOMException, IOException {
		Document doc = WxMsgKit.parse(msg);
		if (null != doc) {
			new XMLOutputter().output(doc, out);
		} else {
			Logger.getAnonymousLogger().warning("发送消息时,解析出dom为空 msg :" + msg);
		}
	}

	public static WxSendMsg builderSendByRecv(WxRecvMsg msg) {
		WxRecvMsg m = new WxRecvMsg(msg);
		String from = m.getFromUser();
		m.setFromUser(m.getToUser());
		m.setToUser(from);
		m.setCreateDt((System.currentTimeMillis() / 1000) + "");
		return new WxSendMsg(m);
	}
}
