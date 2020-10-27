package com.css.observer.base;

/**
 * 具体观察者类2
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteObserver2 implements Observer {
	@Override
	public void response(String message) {
		System.out.println("观察者2收到：" + message);
	}
}
