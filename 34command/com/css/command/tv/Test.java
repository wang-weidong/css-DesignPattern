package com.css.command.tv;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {
	public static void main(String a[]) {

		Television tv = new Television();

		Command openCommand = new TVOpenCommand(tv);
		Command closeCommand = new TVCloseCommand(tv);
		Command changeCommand = new TVChangeCommand(tv);

		Controller control = new Controller(openCommand, closeCommand, changeCommand);
		control.open();
		control.change();
		control.close();
	}
}