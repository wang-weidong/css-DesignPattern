package com.css.command.calculator;

/**
 * 乘法命令类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class MultiCommand extends Command {
	public MultiCommand() {
		this.name = "乘法";
	}

	public void execute(int value) {
		this.value = value;
		result *= value;
	}

	public void undo() {
		result /= value;
	}
}
