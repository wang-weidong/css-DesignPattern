package com.css.mediator.message;

/**
 * 抽象同事类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class AbstractUser {
	protected String name;
	// 中介者抽象类
	protected Mediator mediator;

	// 接受消息
	public abstract void receive(AbstractUser from, String message);

	// 发送广播消息
	public abstract void send(String message);

	// 给指定用户发送消息
	public abstract void sendTo(AbstractUser to, String message);

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
}
