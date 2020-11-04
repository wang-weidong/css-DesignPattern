package com.css.state.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		// 创建当前具体状态类
		State state = new ConcreteStateA();
		// 创建状态上下文
		Context context = new Context(state);
		// 执行请求，通常自动完成状态切换
		context.request();

		context.request();
		context.request();
		context.request();
		context.request();
	}
}
