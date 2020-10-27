package com.css.abstractfactory.base;

/**
 * 产品A
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class AbstractProductA {

	// 每个产品共有的方法
	public void shareMethod() {

	}

	// 每个产品相同方法，不同实现
	public abstract void doSomething();
}
