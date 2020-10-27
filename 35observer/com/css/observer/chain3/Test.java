package com.css.observer.chain3;

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
		Observer subject = new Observer("sub");

		// 创建观察者对象
		Observer observer1 = new ConcreteObserver1("obs1");
		Observer observer21 = new ConcreteObserver2("obs21");
		Observer observer22 = new ConcreteObserver2("obs22");
		Observer observer23 = new ConcreteObserver2("obs23");
		Observer observer24 = new ConcreteObserver2("obs24");

		// 构造链
		observer1.add(observer21);
		observer1.add(observer22);

		observer21.add(observer23);
		observer23.add(observer24);

		// 添加观察者对象
		subject.add(observer1);
		// 通知观察者
		subject.notifyObserver("这是一个来自Subject的消息1");
		subject.notifyObserver("这是一个来自Subject的消息2");
	}
}
