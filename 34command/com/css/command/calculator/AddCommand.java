package com.css.command.calculator;

/**
 * 加法命令类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class AddCommand extends Command {
	public AddCommand() {
		this.name = "加法";
	}

	public void execute(int value) {
		this.value = value;
		result += value;
	}

	public void undo() {
		result -= value;
	}
}