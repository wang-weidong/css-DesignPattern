package com.css.builder.meal;

/**
 * 套餐C-鸡肉卷套餐具体建造者
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class SetMealC extends MealBuilder {

	@Override
	public Meal build() {
		this.meal.setName("鸡肉卷套餐");
		return this.meal
				.addFood(FoodFactory.getFood("鸡肉卷"))
				.addFood(FoodFactory.getFood("果汁"))
				.addFood(FoodFactory.getFood("香肠"));
	}
}