package com.css.decorator.meal;

/**
 * 装饰者的抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class AbstractDecorator extends Meal {

	private Meal meal;

	public AbstractDecorator(Meal meal) {
		this.meal = meal;
	}

	@Override
	public String getDesc() {
		return meal.getDesc();
	}

	@Override
	public int cost() {
		return meal.cost();
	}
}
