package com.css.observer.chain1;

/**
 * 具体观察者类2
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ConcreteObserver2 extends Subject implements Observer {
	@Override
	public void response(String message) {
		System.out.println("观察者2收到：" + message);
		super.notifyObserver(message);
	}
}
