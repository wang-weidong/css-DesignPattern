package com.css.mediator.base;

/***
 * 具体中介者类2
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteMediator2 extends Mediator {

	public void relay(Colleague colleague, String message) {
		for (Colleague c : colleagues) {
			if (!c.equals(colleague)) {
				c.receive(message + ", 来自中介ConcreteMediator2发来的消息.");
			}
		}
	}
}
