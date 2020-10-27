package com.css.command.tv;

/**
 * 抽象命令类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Command {
	protected Television tv;

	public Command(Television tv) {
		this.tv = tv;
	}

	public abstract void execute();
}