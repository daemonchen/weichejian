package com.wechat.sdk.parser;

import org.jdom.Document;
import org.jdom.JDOMException;

import com.wechat.sdk.vo.recv.WxRecvMsg;

public interface WxRecvMsgParser {
	WxRecvMsg parser(Document doc) throws JDOMException;
}
