package com.css.decorator.color;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		Shape shape = new Circle();
		shape = new BorderColorDecorator(shape, "红色");
		shape = new BorderColorDecorator(shape, "黄色");
		shape = new BackgroundColorDecorator(shape, "黑色");
		shape.draw();

		System.out.println("================================");

		Shape shape2 = new Rectangle();
		shape2 = new BorderColorDecorator(shape2, "绿色");
		shape2 = new BackgroundColorDecorator(shape2, "蓝色");
		shape2.draw();

	}
}
