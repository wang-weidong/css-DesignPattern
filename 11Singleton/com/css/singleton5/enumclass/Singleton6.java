package com.css.singleton5.enumclass;

/**
 * 枚举单例
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public enum Singleton6 {
	INSTANCE;

	public static Singleton6 getInstance() {
		return INSTANCE;
	}
}