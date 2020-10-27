package com.css.singleton2.lazy;

/**
 * 懒汉式 线程安全
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Singleton3 {
	private static Singleton3 instance;

	public static synchronized Singleton3 getInstance() {
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
}