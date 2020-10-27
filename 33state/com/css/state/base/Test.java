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
		// 创建状态上下文
		Context context = new Context(new ConcreteStateA());

		// 切换状态, 这个有点类似电灯的开关状态
		context.request();
		context.request();
		context.request();
		context.request();
		context.request();
	}
}
