package com.css.chain.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {
	public static void main(String[] args) {
		// 创建所有处理者
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		// 创建责任链，1-->2-->3
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		// 处理请求，返回结果
		handler1.handleRequest("这是一个请求1", 1);
		handler1.handleRequest("这是一个请求2", 2);
	}
}
