package com.css.flyweight.base;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元对象工厂类，享元类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public final class FlyweightFactory {
	/**
	 * 享元类容器
	 */
	private final static Map<String, Flyweight> flyweights = new HashMap<>();

	public static Flyweight getFlyweight(String key) {
		if (flyweights.containsKey(key)) {
			return flyweights.get(key);
		} else {
			Flyweight flyweight = new ConcreteFlyweight(key);
			flyweights.put(key, flyweight);
			return flyweight;
		}
	}

	public static int size() {
		return flyweights.size();
	}

}
