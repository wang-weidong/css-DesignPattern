package com.css.composite.course;

/**
 * 课程组件实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Course extends Element {
	private double price;

	public Course(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void print() {
		printBlank();
		System.out.println("Course Name: " + name + ", Price: " + price);
	}
}
