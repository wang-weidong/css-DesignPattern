package com.css.mediator.base;

/**
 * 具体同事类2
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteColleague2 extends Colleague {
	@Override
	public void receive(String message) {
		System.out.println("colleague2 receive message: " + message);
	}

	@Override
	public void send(String message) {
		System.out.println("colleague2 send message: " + message);
		// 请中介者转发
		if (this.mediator != null)
			this.mediator.relay(this, message);
	}
}
