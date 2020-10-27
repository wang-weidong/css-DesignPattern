package com.css.other.filter18;

/**
 * 具体的同事类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class User extends AbstractUser {
	@Override
	public void receive(String message) {
		System.out.println("recv: " + message);
	}

	@Override
	public void send(String message) {
		System.out.println("send: " + message);
		this.mediator.relay(this, message);
	}
}
