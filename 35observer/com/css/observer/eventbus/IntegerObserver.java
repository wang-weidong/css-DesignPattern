package com.css.observer.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * 整数消息-观察者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class IntegerObserver {
	@Subscribe
	public void sub(Integer message) {
		System.out.println("IntegerObserver, 这是收到的 Integer 消息: " + message);
	}
}