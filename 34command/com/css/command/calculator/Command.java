package com.css.command.calculator;

/**
 * 抽象命令类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Command {
	protected int result = 0;
	protected int value;
	protected String name;

	public abstract void execute(int value);

	public abstract void undo();
}
