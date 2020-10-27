package com.css.simplefactory.base;

/**
 * 简单工厂
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ProductFactory {
	public static IProduct createProduct(String name) {
		if ("productA".equals(name))
			return new ProductA();
		else if ("productB".equals(name))
			return new ProductB();
		return null;
	}
}
