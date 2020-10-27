package com.css.mediator.message;

/**
 * 抽象中介者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class Mediator {

	// 注册同事
	public abstract void register(AbstractUser user);

	// 通知中介者，发送广播消息
	public abstract void relay(AbstractUser from, String message);

	// 通知中介者，给指定用户发送消息
	public abstract void relayTo(AbstractUser from, AbstractUser to, String message);

}
