package com.css.command.calculator;

/**
 * 命令执行者/调用者
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class CalculatorForm {
	private Command command = null;

	public void setCommand(Command command) {
		if (this.command != null)
			command.result = this.command.result;
		this.command = command;
	}

	public void compute(int value) {
		command.execute(value);
		System.out.println("执行" + this.command.name + "运算，运算结果为：" + this.command.result);
	}

	public void undo() {
		command.undo();
		System.out.println("执行" + this.command.name + "撤销，运算结果为：" + this.command.result);
	}
}