package com.css.composite.meal;

import java.util.ArrayList;

/**
 * 早餐容器构件
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Meal extends Food {
	public Meal(String name) {
		super(name, 0);
	}

	private ArrayList<Food> list = new ArrayList<>();

	public void add(Food food) {
		list.add(food);
	}

	public void print() {
		System.out.println("----------" + name + "----------");
		for (Food food : list) {
			food.print();
			this.price += food.price;
		}
		System.out.println("总价：" + this.price);
	}
}