package com.css.template.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		AbstractClass temp1 = new ConcreteClass1();
		temp1.templateMethod();

		System.out.println("------------------------------------");

		AbstractClass temp2 = new ConcreteClass2();
		temp2.templateMethod();
	}

}
