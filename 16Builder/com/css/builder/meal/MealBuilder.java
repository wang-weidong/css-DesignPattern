package com.css.builder.meal;

/**
 * 套餐抽象建造者
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class MealBuilder {

	protected Meal meal = new Meal();

	public abstract Meal build();

	public Meal getMeal() {
		return meal;
	}

}