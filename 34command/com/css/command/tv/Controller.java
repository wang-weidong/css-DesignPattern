package com.css.command.tv;

/**
 * 命令执行者/调用者
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Controller {
	private Command openCommand, closeCommand, changeCommand;

	public Controller(Command openCommand, Command closeCommand, Command changeCommand) {
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.changeCommand = changeCommand;
	}

	public void open() {
		openCommand.execute();
	}

	public void change() {
		changeCommand.execute();
	}

	public void close() {
		closeCommand.execute();
	}
}