package com.wechat.sdk.parser;

import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Text;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.jdom.xpath.XPath;

import com.wechat.sdk.vo.recv.WxRecvMsg;

public abstract class WxRecvMsgBaseParser implements WxRecvMsgParser {

	public WxRecvMsg parser(Document doc) throws JDOMException {
		/*try {
			Format format = Format.getPrettyFormat();
			format.setEncoding("GBK");
			new XMLOutputter(format).output(doc, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		Element root = doc.getRootElement();
		String toUserName = getElementText(root, "ToUserName");
		String fromUserName = getElementText(root, "FromUserName");
		String createTime = getElementText(root, "CreateTime");
		String msgType = getElementText(root, "MsgType");
		String msgId = getElementText(root, "MsgId");

		return parser(root, new WxRecvMsg(toUserName, fromUserName, createTime,
				msgType, msgId));
	}

	protected abstract WxRecvMsg parser(Element root, WxRecvMsg msg)
			throws JDOMException;

	protected String getElementText(Element elem, String xpath)
			throws JDOMException {
		Text text = ((Text) XPath.selectSingleNode(elem, xpath + "/text()"));
		if (null == text) {
			return "";
		}
		return text.getText();
	}

}
