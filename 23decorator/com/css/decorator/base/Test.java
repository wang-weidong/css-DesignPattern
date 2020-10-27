package com.css.decorator.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();

		// 第一次修饰
		component = new ConcreteDecorator1(component);

		// 第二次修饰
		component = new ConcreteDecorator2(component);

		// 修饰后运行
		component.operate();

	}

}
