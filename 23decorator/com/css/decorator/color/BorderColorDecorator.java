package com.css.decorator.color;

/**
 * 边框着色装饰器具体实现
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class BorderColorDecorator extends ShapeDecorator {
	private String color;

	// 通过构造函数传递被修饰者
	public BorderColorDecorator(Shape shape, String color) {
		super(shape);
		this.color = color;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("画上" + color + "边框");
	}

}
