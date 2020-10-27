package com.css.builder.base1;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void setBuilder(Builder builder) {
		Director director = new Director(builder);
		Product product = director.construct();
		System.out.println("--------------------------");
		System.out.println(product.getPartA());
		System.out.println(product.getPartB());
		System.out.println(product.getPartC());
	}

	public static void main(String[] args) {

		setBuilder(new ConcreteBuilder1());
		setBuilder(new ConcreteBuilder2());
	}

}
