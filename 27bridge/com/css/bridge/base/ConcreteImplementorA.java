package com.css.bridge.base;

/**
 * 具体实现类A
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteImplementorA implements Implementor {
	@Override
	public void operationImpl() {
		System.out.println("桥接A");
	}
}
