package com.css.state.base;

/**
 * 具体状态类B
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteStateB implements State {
	@Override
	public void handle(Context context) {
		System.out.println("关");
		context.setState(new ConcreteStateA());
	}
}
