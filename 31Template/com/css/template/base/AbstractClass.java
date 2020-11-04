package com.css.template.base;

/**
 * 抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class AbstractClass {
	// 模板方法
	public void templateMethod() {
		operation1();
		operation2();
		operation3();
	}

	// 具体方法
	private void operation1() {
		System.out.println("operation1");
	}

	// 抽象方法
	public abstract void operation2();

	// 钩子方法
	protected void operation3() {
	}
}