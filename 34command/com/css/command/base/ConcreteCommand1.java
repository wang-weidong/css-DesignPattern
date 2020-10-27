package com.css.command.base;

/**
 * 具体命令类1
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteCommand1 extends Command {

	public ConcreteCommand1(Receiver... receivers) {
		super(receivers);
	}

	@Override
	public void execute() {
		for (Receiver receiver : receivers)
			receiver.action("concrete command 1.");
	}
}
