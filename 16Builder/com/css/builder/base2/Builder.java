package com.css.builder.base2;

/**
 * 抽象建造者
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Builder {
	protected Product product = new Product();

	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract void buildPartC();

	// 返回产品对象
	public Product getResult() {
		return product;
	}

	// 产品构建与组装方法
	public Product construct() {
		this.buildPartA();
		this.buildPartB();
		this.buildPartC();
		return this.getResult();
	}
}
