package com.css.builder.meal;

/**
 * 套餐A-煎饼套餐具体建造者
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class SetMealA extends MealBuilder {

	@Override
	public Meal build() {
		this.meal.setName("煎饼套餐");
		return this.meal
				.addFood(FoodFactory.getFood("煎饼"))
				.addFood(FoodFactory.getFood("鸡蛋"))
				.addFood(FoodFactory.getFood("鸡蛋"))
				.addFood(FoodFactory.getFood("香肠"))
				.addFood(FoodFactory.getFood("香肠"))
				.addFood(FoodFactory.getFood("牛奶"));
	}
}