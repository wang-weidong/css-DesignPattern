package com.css.mediator.message;

/**
 * 用户类-具体同事类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class MessageUser extends AbstractUser {
	public MessageUser(String name) {
		this.name = name;
	}

	@Override
	public void receive(AbstractUser from, String message) {
		System.out.println(this.name + " receive " + message + " from " + from.name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " send " + message);
		this.mediator.relay(this, message);
	}

	@Override
	public void sendTo(AbstractUser to, String message) {
		this.mediator.relayTo(this, to, message);
	}
}
