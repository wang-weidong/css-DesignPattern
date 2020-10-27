package com.css.command.calculator;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {
	public static void main(String args[]) {

		CalculatorForm form = new CalculatorForm();

		AddCommand addCommand = new AddCommand();
		MultiCommand multiCommand = new MultiCommand();

		form.setCommand(addCommand);
		form.compute(10);
		form.compute(5);
		form.compute(10);
		form.undo();

		form.setCommand(multiCommand);
		form.compute(2);
		form.compute(3);
		form.undo();

		form.setCommand(addCommand);
		form.compute(10);
		form.undo();
		form.compute(5);
		form.compute(10);
	}
}