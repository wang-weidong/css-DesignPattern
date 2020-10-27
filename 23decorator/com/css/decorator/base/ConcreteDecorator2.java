package com.css.decorator.base;

/**
 * 装饰器具体实现2
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteDecorator2 extends Decorator {

	// 通过构造函数传递被修饰者
	public ConcreteDecorator2(Component component) {
		super(component);
	}

	// 重写父类的operate方法
	public void operate() {
		super.operate();
		System.out.println("ConcreteDecorator2");
	}
}
