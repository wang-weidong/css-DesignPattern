package com.css.decorator.base;

/**
 * 装饰器的抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Decorator implements Component {
	/**
	 * 被修饰者对象
	 */
	private Component component;

	// 通过构造函数传递被修饰者
	public Decorator(Component component) {
		this.component = component;
	}

	// 委托给被修饰者执行
	public void operate() {
		this.component.operate();
	}

}
