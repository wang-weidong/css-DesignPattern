package com.css.mediator.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {

		// 构建中介者
		Mediator mediator1 = new ConcreteMediator1();
		Mediator mediator2 = new ConcreteMediator2();

		// 构建具体的同事类
		Colleague colleague1 = new ConcreteColleague1();
		Colleague colleague2 = new ConcreteColleague2();

		// 注册同事
		mediator1.register(colleague1);
		mediator1.register(colleague2);

		mediator2.register(colleague1);
		mediator2.register(colleague2);

		colleague1.setMediator(mediator1);
		colleague2.setMediator(mediator1);

		// 发送消息
		colleague1.send("消息1");
		colleague2.send("消息2");

		System.out.println("--------------------------------------------------------------------");

		// 注册同事

		colleague2.setMediator(mediator2);

		// 发送消息
		colleague1.send("消息1");
		colleague2.send("消息2");

	}
}
