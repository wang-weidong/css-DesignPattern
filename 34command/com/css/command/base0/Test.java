package com.css.command.base0;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		// 创建执行者
		Invoker invoker = new Invoker();

		// 创建命令
		ConcreteCommand1 concreteCommand1 = new ConcreteCommand1();
		ConcreteCommand2 concreteCommand2 = new ConcreteCommand2();

		// 添加命令，执行命令
		invoker.setCommand(concreteCommand1);
		invoker.execute();

		// 添加命令，执行命令
		invoker.setCommand(concreteCommand2);
		invoker.execute();
	}
}
