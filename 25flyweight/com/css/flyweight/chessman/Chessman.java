package com.css.flyweight.chessman;

/**
 * 五子棋棋子类：Flyweight（抽象享元类）
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Chessman {

	public abstract void display();

	/**
	 * 通过该接口，可以接受并作用于外部状态
	 */
	public abstract void display(CoordinateExtrinsic extrinsic);
}
