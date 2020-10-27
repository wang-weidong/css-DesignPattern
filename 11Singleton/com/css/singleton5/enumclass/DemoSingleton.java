package com.css.singleton5.enumclass;

/**
 * 枚举单例，创建枚举默认就是线程安全的
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public enum DemoSingleton {
	INSTANCE;

	private DemoConfig config;

	private DemoSingleton() {
		config = new DemoConfig(20);
	}

	public DemoConfig getConfig() {
		return config;
	}

	public String getData(int index) {
		return config.getData(index);
	}

	public static DemoSingleton getInstance() {
		return INSTANCE;
	}
}