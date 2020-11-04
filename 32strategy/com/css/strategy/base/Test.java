package com.css.strategy.base;

/**
 * 测试
 */
public class Test {

	public static void main(String[] args) {
		// 创建一个具体的策略对象
		Strategy strategy = new ConcreteStrategy1();
		// 创建上下文对象，传入具体策略对象
		Context context = new Context(strategy);
		// 执行算法
		context.algorithm();
	}
}
