package com.css.flyweight.chessman;

import java.util.HashMap;

/**
 * FlyweightFactory（享元工厂类）：享元工厂类用于创建并管理享元对象
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ChessmanFactory {
	// 使用HashMap存储享元对象，充当享元池
	private static final ChessmanFactory INSTANCE = new ChessmanFactory();
	private static final HashMap<String, Chessman> chessmanMaps = new HashMap<>();
	static {
		chessmanMaps.put("w", new ChessmanGood("白色"));
		chessmanMaps.put("b", new ChessmanGood("黑色"));
		chessmanMaps.put("n", new ChessmanBad());
	}

	public static ChessmanFactory getFactory() {
		return INSTANCE;
	}

	public Chessman getChessman(String color) {
		return chessmanMaps.get(color);
	}

	// 实例数
	public int getCount() {
		return chessmanMaps.size();
	}

}
