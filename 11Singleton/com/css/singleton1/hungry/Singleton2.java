package com.css.singleton1.hungry;

/**
 * 饿汉式
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Singleton2 {
	private static Singleton2 INSTANCE;
	static {
		INSTANCE = new Singleton2();
	}

	public static Singleton2 getInstance() {
		return INSTANCE;
	}

}
