package com.css.visitor.base0;

/**
 * 具体访问者1
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteVisitor1 implements Visitor {
	@Override
	public void visitA(Element element) {
		System.out.println("ConcreteVisitor1包装新操作: " + element.operation());
	}
}
