package com.css.bridge.base;

/**
 * 抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Abstraction {

	/**
	 * 桥接组合对象
	 */
	protected Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	/**
	 * 操作类
	 */
	public abstract void operation();
}
