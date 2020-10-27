package com.css.simplefactory.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		IProduct product;

		product = ProductFactory.createProduct("productA");
		product.produce();

		product = ProductFactory.createProduct("productB");
		product.produce();
	}
}
