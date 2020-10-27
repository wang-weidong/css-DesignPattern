package com.css.bridge.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {

		Abstraction abstraction1 = new RefinedAbstraction(new ConcreteImplementorA());
		Abstraction abstraction2 = new RefinedAbstraction(new ConcreteImplementorB());

		abstraction1.operation();
		abstraction2.operation();
	}
}
