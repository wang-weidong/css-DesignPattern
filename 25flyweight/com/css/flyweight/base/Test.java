package com.css.flyweight.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		String[] keys = { "1", "1", "2", "2", "3", "3" };
		for (String key : keys) {
			Flyweight flyweight = FlyweightFactory.getFlyweight(key);
			flyweight.operation("测试" + key);
		}
		System.out.println("size: " + FlyweightFactory.size());
	}
}
