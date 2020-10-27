package com.css.singleton4.Innerclass;

/**
 * 静态内部类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Singleton5 {
	private static class Holder {
		private final static Singleton5 INSTANCE = new Singleton5();
	}

	public static Singleton5 getInstance() {
		return Holder.INSTANCE;
	}
}