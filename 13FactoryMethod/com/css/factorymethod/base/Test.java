package com.css.factorymethod.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		Factory factory = new ConcreteFactory();
		Product product = factory.createProduct(ConcreteProduct1.class);
		product.method1();
		product.method2();

		System.out.println("--------------------------------");
		/*
		 * 继续业务处理
		 */
		product = factory.createProduct(ConcreteProduct2.class);
		product.method1();
		product.method2();
	}
}
