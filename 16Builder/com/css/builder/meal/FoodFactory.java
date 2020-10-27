package com.css.builder.meal;

import java.util.HashMap;
import java.util.Map;

/**
 * 食物工厂类--单例
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FoodFactory {
	public final static Map<String, Food> foods = new HashMap<>();
	static {
		foods.put("煎饼", new Food("一个薄煎饼", 8));
		foods.put("鸡蛋", new Food("一个鸡蛋", 1));
		foods.put("香肠", new Food("一根香肠", 2));
		foods.put("牛奶", new Food("一杯牛奶", 5));
		foods.put("鸡腿堡", new Food("一个鸡腿堡", 10));
		foods.put("鸡肉卷", new Food("一个鸡肉卷", 12));
		foods.put("可乐", new Food("一杯果汁", 5));
		foods.put("果汁", new Food("一杯果汁", 5));
	}

	public static Food getFood(String key) {
		return foods.get(key);
	}
}
