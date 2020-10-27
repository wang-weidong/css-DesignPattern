package com.css.builder.meal;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐产品类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Meal {
	private String name;
	private List<Food> foodList = new ArrayList<>();
	private int total = 0;

	public Meal addFood(Food food) {
		foodList.add(food);
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public void print() {
		System.out.println("----------" + name + "----------");
		for (Food food : foodList) {
			food.print();
			this.total += food.price;
		}
		System.out.println("总价：" + this.total);
	}
}