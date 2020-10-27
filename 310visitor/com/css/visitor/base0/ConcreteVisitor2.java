package com.css.visitor.base0;

/**
 * 具体访问者2
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteVisitor2 implements Visitor {
	@Override
	public void visitA(Element element) {
		System.out.println("ConcreteVisitor2包装新操作: " + element.operation());
	}
}
