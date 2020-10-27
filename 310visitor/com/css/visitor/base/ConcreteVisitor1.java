package com.css.visitor.base;

/**
 * 具体访问者1
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteVisitor1 implements Visitor {
	@Override
	public void visitA(ConcreteElementA element) {
		System.out.println("ConcreteVisitor1包装新操作: " + element.operation());
	}

	@Override
	public void visitB(ConcreteElementB element) {
		System.out.println("ConcreteVisitor1包装新操作: " + element.operation());
	}
}
