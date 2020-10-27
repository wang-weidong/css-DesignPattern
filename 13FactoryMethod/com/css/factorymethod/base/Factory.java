package com.css.factorymethod.base;

/**
 * 抽象工厂
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Factory {

	/*
	 * 创建一个产品对象,其输入参数类型可以自行设置 通常为String、Enum、Class等，当然也可以为空
	 */
	public abstract Product createProduct(Class<?> c);
}
