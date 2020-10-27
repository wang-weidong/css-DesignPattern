package com.css.singleton1.hungry;

import java.io.Serializable;

/**
 * 饿汉式
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
@SuppressWarnings("serial")
public class SingletonSafe implements Serializable {
	private static SingletonSafe INSTANCE = new SingletonSafe();

	public static SingletonSafe getInstance() {
		return INSTANCE;
	}

	private SingletonSafe() {
		if (INSTANCE != null) {
			throw new RuntimeException("单例对象禁止反射调用!");
		}
	}

	public Object readResolve() {
		return (Object) INSTANCE;
	}
}
