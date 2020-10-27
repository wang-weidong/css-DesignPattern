package com.css.decorator.meal;

/**
 * 煎饼早餐的抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class Meal {

	/**
	 * 描述
	 * 
	 * @return
	 */
	public abstract String getDesc();

	/**
	 * 总价
	 * 
	 * @return
	 */
	public abstract int cost();

}
