package com.css.observer.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * 字符串消息-观察者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class StringObserver {
	@Subscribe
	public void sub(String message) {
		System.out.println("StringObserver, 这是收到的 String 消息: " + message);
	}
}