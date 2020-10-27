package com.css.abstractfactory.base;

/**
 * 工厂2，只生产产品等级为2的产品
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Creator2 extends AbstractCreator {

	// 只生产产品等级为2的A产品
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	// 只生产产品等级为2的B产品
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
