package com.css.builder.meal;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Client {
	public static void main(String[] args) {
		Meal meal = new SetMealA().build();
		meal.print();

		meal = new SetMealB().build();
		meal.print();

		meal = new SetMealC().build();
		meal.print();
	}
}
