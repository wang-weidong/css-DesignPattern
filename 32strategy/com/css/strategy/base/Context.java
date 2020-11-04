package com.css.strategy.base;

/**
 * 环境类，会持有一个具体的策略对象
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Context {
	// 抽象策略
	private Strategy strategy;

	// 构造函数设置具体策略
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	// 封装后的策略方法
	public void algorithm() {
		System.out.println("begin");
		this.strategy.algorithm();
		System.out.println("end");
	}
}
