package com.css.command.base;

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

		// 创建命令接收方
		Receiver receiver1 = new ConcreteReceiver1();
		Receiver receiver2 = new ConcreteReceiver2();

		// 创建命令
		Command concreteCommand1 = new ConcreteCommand1(receiver1, receiver2);
		Command concreteCommand2 = new ConcreteCommand2(receiver2);

		// 添加命令
		invoker.addCommand(concreteCommand1);
		invoker.addCommand(concreteCommand2);

		// 执行
		invoker.execute();
	}
}
