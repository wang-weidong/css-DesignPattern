package com.css.visitor.base0;

/**
 * 组件类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Element {
	private Visitor visitor;

	public void accept(Visitor visitor) {
		this.visitor = visitor;
		this.visitor.visitA(this);
	}

	public String operation() {
		return "Element";
	}
}
