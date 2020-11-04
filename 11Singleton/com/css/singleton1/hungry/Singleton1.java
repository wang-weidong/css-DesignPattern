package com.css.singleton1.hungry;

import java.io.Serializable;

/**
 * 饿汉式
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Singleton1 implements Serializable {
	private static Singleton1 INSTANCE = new Singleton1();
	
	public static Singleton1 getInstance() {
		return INSTANCE;
	}
}
