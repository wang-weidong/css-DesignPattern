package com.css.builder.base2;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Client {
	Builder builder;

	public void setBuilder(Builder builder) {
		this.builder = builder;
		Product product = builder.construct();
		System.out.println("--------------------------");
		System.out.println(product.getPartA());
		System.out.println(product.getPartB());
		System.out.println(product.getPartC());

	}

	public static void main(String[] args) {
		Client c = new Client();
		c.setBuilder(new ConcreteBuilder1());
		c.setBuilder(new ConcreteBuilder2());
	}

}
