package com.css.decorator.meal;

/**
 * 装饰者的具体实现
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class MilkDecorator extends AbstractDecorator {

	public MilkDecorator(Meal meal) {
		super(meal);
	}

	@Override
	public String getDesc() {
		return super.getDesc() + "\n加一杯牛奶  5元";
	}

	@Override
	public int cost() {
		return super.cost() + 5;
	}
}
