package com.css.proxy.base;

/**
 * 被代理的接口类，抽象的目标接口，定义具体的目标对象和代理公用的接口
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public interface Subject {

	/**
	 * 定义一个方法，由具体实现类去实现该方法
	 */
	public void request();

}
