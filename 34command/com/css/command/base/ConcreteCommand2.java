package com.css.command.base;

/**
 * 具体命令类2
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteCommand2 extends Command {

	public ConcreteCommand2(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receivers[0].action("concrete command 2.");
	}
}
