package com.css.template.base;

/**
 * 具体实现子类2
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteClass2 extends AbstractClass {

	@Override
	public void operation2() {
		System.out.println("ConcreteClass2.operation2");

	}

	@Override
	protected void operation3() {
		System.out.println("这是一个扩展的ConcreteClass2.operation3");
	}
}
