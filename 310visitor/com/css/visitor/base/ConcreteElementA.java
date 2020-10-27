package com.css.visitor.base;

/**
 * 具体组件类A
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteElementA implements Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.visitA(this);
	}

	@Override
	public String operation() {
		return "ConcreteElementA";
	}
}
