package com.css.composite.meal;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		Food meal = new Meal("一顿早餐");

		meal.add(FoodFactory.getFood("煎饼"));
		meal.add(FoodFactory.getFood("鸡蛋"));
		meal.add(FoodFactory.getFood("鸡蛋"));
		meal.add(FoodFactory.getFood("香肠"));
		meal.add(FoodFactory.getFood("香肠"));
		meal.add(FoodFactory.getFood("牛奶"));

		meal.print();
	}
}
