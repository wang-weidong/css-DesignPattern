package com.css.observer.eventbus;

import com.google.common.eventbus.EventBus;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {
	public static void main(String[] args) {

		StringObserver dataObserver1 = new StringObserver();
		IntegerObserver dataObserver2 = new IntegerObserver();

		EventBus eventBus = new EventBus();
		eventBus.register(dataObserver1);
		eventBus.register(dataObserver2);

		eventBus.post("a string");
		eventBus.post(1);
		eventBus.post("3");

		System.out.println("-----------------------------------------------");

		eventBus.unregister(dataObserver1);
		eventBus.post("a string");
		eventBus.post(1);

	}
}