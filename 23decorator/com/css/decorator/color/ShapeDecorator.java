package com.css.decorator.color;

/**
 * 装饰器的抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class ShapeDecorator implements Shape {
	/**
	 * 被修饰者对象
	 */
	protected Shape shape;

	// 通过构造函数传递被修饰者
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void draw() {
		shape.draw();
	}
}
