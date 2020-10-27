package com.css.decorator.meal;

/**
 * 煎饼早餐的具体实现
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class PancakeMeal extends Meal {
	@Override
	public String getDesc() {
		return "薄煎饼  8元";
	}

	@Override
	public int cost() {
		return 8;
	}
}
