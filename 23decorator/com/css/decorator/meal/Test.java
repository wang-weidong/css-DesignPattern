package com.css.decorator.meal;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		Meal meal = new PancakeMeal();

		meal = new EggDecorator(meal);
		meal = new EggDecorator(meal);
		meal = new SausageDecorator(meal);
		meal = new SausageDecorator(meal);
		meal = new MilkDecorator(meal);

		System.out.println(meal.getDesc() + "\n总价：" + meal.cost());
	}
}
