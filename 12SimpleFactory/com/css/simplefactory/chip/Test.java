package com.css.simplefactory.chip;

/**
 * 测试，为了培训好看命名未按规范起
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {

		ChipFactory videoFactory = new ChipFactory();
		Chip chip = videoFactory.getChip(ChipLoongson.class);
		chip.produce();

		chip = videoFactory.getChip(ChipPhytium.class);
		chip.produce();
	}

}
