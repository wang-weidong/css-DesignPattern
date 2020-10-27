package com.css.simplefactory.base;

/**
 * 产品A实现
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ProductB implements IProduct {
	@Override
	public void produce() {
		System.out.println("产品B逻辑");
	}
}
