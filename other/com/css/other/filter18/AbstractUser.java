package com.css.other.filter18;

/**
 * 同事抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class AbstractUser {

	// 中介者抽象类
	protected Mediator mediator;

	// 接受消息
	public abstract void receive(String message);

	// 发送消息
	public abstract void send(String message);

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

}
