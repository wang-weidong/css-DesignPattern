package com.css.factorymethod.base;

/**
 * 抽象产品类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Product {
	// 产品类的公共方法
	public void method1() {
		// 业务逻辑处理
		System.out.println("--public method1--");
	}

	// 抽象方法1
	public abstract void method2();

}
