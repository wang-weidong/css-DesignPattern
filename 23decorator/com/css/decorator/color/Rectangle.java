package com.css.decorator.color;

/**
 * shape组件Rectangle的具体实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("画一个矩形");
	}
}
