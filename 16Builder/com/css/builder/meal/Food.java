package com.css.builder.meal;

/**
 * 食物类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Food {
	protected String name;
	protected int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println(name + " " + price + "元");
	}
}