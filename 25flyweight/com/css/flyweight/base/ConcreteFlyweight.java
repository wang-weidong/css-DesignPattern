package com.css.flyweight.base;

/**
 * 可以被共享的对象
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteFlyweight implements Flyweight {

	private String intrinsicState;

	public ConcreteFlyweight(String intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	@Override
	public void operation(String extrinsicState) {
		System.out.println(this.intrinsicState + "--" + extrinsicState);
	}
}
