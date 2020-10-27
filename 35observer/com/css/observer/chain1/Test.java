package com.css.observer.chain1;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		// 创建主题对象
		Subject subject = new Subject();

		// 创建观察者对象
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();

		// 构造链
		observer1.add(observer2);

		// 添加观察者对象
		subject.add(observer1);
		// 通知观察者
		subject.notifyObserver("这是一个来自Subject的消息1");
		subject.notifyObserver("这是一个来自Subject的消息2");
	}
}
