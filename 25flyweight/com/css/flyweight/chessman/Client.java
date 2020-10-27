package com.css.flyweight.chessman;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Client {
	public static void main(String[] args) {
		// 获取享元工厂对象
		ChessmanFactory factory = ChessmanFactory.getFactory();
		// 获取2枚黑棋、2枚白棋、2枚坏了的棋子
		Chessman black1 = factory.getChessman("b");
		Chessman black2 = factory.getChessman("b");
		System.out.println("判断黑棋是否相同:" + (black1 == black2));

		Chessman white1 = factory.getChessman("w");
		Chessman white2 = factory.getChessman("w");
		System.out.println("判断白棋是否相同:" + (white1 == white2));

		Chessman bad1 = factory.getChessman("n");
		Chessman bad2 = factory.getChessman("n");
		System.out.println("判断坏了的棋子是否相同:" + (bad1 == bad2));

		System.out.println();
		System.out.println("棋子的实例数：" + factory.getCount());

		System.out.println();
		// 显示棋子
		black1.display();
		white1.display();
		bad1.display();

		// 显示棋子,同时设置坐标位置
		System.out.println();
		black2.display(new CoordinateExtrinsic(1, 2));
		white2.display(new CoordinateExtrinsic(2, 3));
		bad2.display(new CoordinateExtrinsic(1, 2));
	}
}
