package com.css.flyweight.chessman;

/**
 * 坏了的棋子就不管他的颜色了
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ChessmanBad extends Chessman {
	@Override
	public void display() {
		System.out.println("这个棋子已坏");
	}

	@Override
	public void display(CoordinateExtrinsic extrinsic) {
		System.out.println("这个棋子已坏");
	}
}