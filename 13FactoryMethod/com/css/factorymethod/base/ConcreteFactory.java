package com.css.factorymethod.base;

/**
 * 具体工厂实现
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteFactory extends Factory {

	public Product createProduct(Class<?> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
		}
		return product;
	}

}
