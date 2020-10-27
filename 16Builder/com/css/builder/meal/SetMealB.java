package com.css.builder.meal;

/**
 * 套餐B-鸡腿堡套餐具体建造者
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class SetMealB extends MealBuilder {

	@Override
	public Meal build() {
		this.meal.setName("鸡腿堡套餐");
		return this.meal
				.addFood(FoodFactory.getFood("鸡腿堡"))
				.addFood(FoodFactory.getFood("可乐"));
	}
}