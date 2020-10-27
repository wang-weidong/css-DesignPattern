package com.css.prototype.email;

import java.io.*;

/**
 * 内部引用的附件类，注意要实现 Serializable接口，否则无法序列化
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
@SuppressWarnings("serial")
public class Attachment implements Serializable {
	String attachTitle = "";

	public void setAttachTitle(String attachTitle) {
		this.attachTitle = attachTitle;
	}

	public String getAttachTitle() {
		return attachTitle;
	}

}