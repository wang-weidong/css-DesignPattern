package com.css.command.base;

/**
 * 具体命令接收者类1
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteReceiver1 implements Receiver {

	// 每个接受者都必须处理一定的业务逻辑
	public void action(String name) {
		System.out.println("ConcreteReciver1 reciver message: " + name);
	}
}
