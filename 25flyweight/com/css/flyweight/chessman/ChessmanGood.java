package com.css.flyweight.chessman;

/**
 * 具体的棋子：ConcreteFlyweight（具体享元类）：它实现了抽象享元类，其实例称为享元对象
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ChessmanGood extends Chessman {
	// 为内部状态增加存储空间
	// 棋子的内部属性：颜色
	private String color_intrinsic;

	// 要求享元角色 必须接受内部状态
	public ChessmanGood(String color_intrinsic) {
		this.color_intrinsic = color_intrinsic;
	}

	@Override
	public void display() {
		System.out.println("棋子颜色：" + color_intrinsic + "\t在棋盒里");
	}

	@Override
	public void display(CoordinateExtrinsic extrinsic) {
		System.out.println("棋子颜色：" + color_intrinsic + "\t位置：(" + extrinsic.getX() + "," + extrinsic.getY() + ")");
	}
}