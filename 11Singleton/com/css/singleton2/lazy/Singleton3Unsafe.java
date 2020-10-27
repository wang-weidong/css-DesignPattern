package com.css.singleton2.lazy;

/**
 * 懒汉式 线程不安全
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Singleton3Unsafe {
	private static Singleton3Unsafe instance;

	public static Singleton3Unsafe getInstance() {
		if (instance == null) {
			instance = new Singleton3Unsafe();
		}
		return instance;
	}
}