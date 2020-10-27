package com.css.decorator.color;

/**
 * 背景着色装饰器具体实现
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class BackgroundColorDecorator extends ShapeDecorator {
	private String color;

	// 通过构造函数传递被修饰者
	public BackgroundColorDecorator(Shape shape, String color) {
		super(shape);
		this.color = color;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("填充" + color + "背景");
	}

}
