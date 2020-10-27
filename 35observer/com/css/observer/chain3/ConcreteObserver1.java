package com.css.observer.chain3;

/**
 * 具体观察者类1
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ConcreteObserver1 extends Observer {

	public ConcreteObserver1(String name) {
		super(name);
	}

	@Override
	public void response(String message, String from) {
		System.out.println("观察者1[" + this.name + "]收到[" + from + "]: " + message);
		super.notifyObserver(message);
	}
}
