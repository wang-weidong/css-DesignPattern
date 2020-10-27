package com.css.flyweight.base;

/**
 * 不被共享的对象
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class UnsharedConcreteFlyweight implements Flyweight {

	private String allState;

	public UnsharedConcreteFlyweight(String allState) {
		this.allState = allState;
	}

	@Override
	public void operation(String extrinsicState) {
		System.out.println(this.allState + "----" + extrinsicState);
	}
}
