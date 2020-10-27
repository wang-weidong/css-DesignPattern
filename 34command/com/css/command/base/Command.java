package com.css.command.base;

/**
 * 抽象命令类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Command {
	protected Receiver[] receivers;

	public Command(Receiver... receivers) {
		this.receivers = receivers;
	}

	public abstract void execute();
}
