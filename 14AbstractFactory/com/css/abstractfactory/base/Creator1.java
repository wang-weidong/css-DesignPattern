package com.css.abstractfactory.base;

/**
 * 工厂1，只生产产品等级为1的产品
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Creator1 extends AbstractCreator {

	// 只生产产品等级为1的A产品
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	// 只生产产品等级为1的B产品
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
