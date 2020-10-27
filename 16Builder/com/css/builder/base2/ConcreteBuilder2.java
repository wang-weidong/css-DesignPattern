package com.css.builder.base2;

/**
 * 具体建造者
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteBuilder2 extends Builder {

	@Override
	public void buildPartA() {
		product.setPartA(this.getClass().getSimpleName() + ".buildPartA");
	}

	@Override
	public void buildPartB() {
		product.setPartB(this.getClass().getSimpleName() + ".buildPartB");
	}

	@Override
	public void buildPartC() {
		product.setPartC(this.getClass().getSimpleName() + ".buildPartC");
	}

}
