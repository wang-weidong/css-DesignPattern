package com.css.visitor.base0;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {
	public static void main(String[] args) {
		// 初始化元素
		Element element = new Element();

		Visitor visior1 = new ConcreteVisitor1();
		Visitor visior2 = new ConcreteVisitor2();

		// 回调注入
		element.accept(visior1);
		element.accept(visior2);
	}

}
