package com.css.mediator.message;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		// 构建中介者
		Mediator mediator = new MessageMediator();

		// 构建具体的同事类
		AbstractUser user1 = new MessageUser("张三");
		AbstractUser user2 = new MessageUser("李四");
		AbstractUser user3 = new MessageUser("王五");

		// 注册同事
		mediator.register(user1);
		mediator.register(user2);
		mediator.register(user3);

		// 发送广播消息
		user1.send("message-1");
		System.out.println("-------------------------------");

		user2.send("message-2");
		System.out.println("-------------------------------");

		user3.send("message-3");
		System.out.println("-------------------------------");

		// 发送消息
		user1.sendTo(user2, "消息-12");
		user3.sendTo(user1, "消息-31");

	}
}
