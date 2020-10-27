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
		// 声明出所有的处理节点
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		// 设置链中的阶段顺序,1-->2-->3
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		// 提交请求，返回结果
		handler1.handleRequest("这是一个请求", 2);
	}
}
