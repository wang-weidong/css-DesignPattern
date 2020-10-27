package com.css.other.filter19;

/**
 * 具体元素
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Element {
	private Visitor visitor;
	private String message;

	public Element(String message) {
		this.message = message;
	}

	public void accept(Visitor visitor) {
		this.visitor = visitor;
		this.visitor.visit(this);
	}

	public String getMessage() {
		return message;
	}
}
