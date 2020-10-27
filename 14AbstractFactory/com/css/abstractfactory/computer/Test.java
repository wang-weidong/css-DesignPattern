package com.css.abstractfactory.computer;

/**
 * 测试，为了培训好看命名未按规范起
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		// 飞腾产品族, 龙芯产品族
		FactoryComputer[] factoryArray = { new FactoryPK(), new FactoryLoogson() };

		for (FactoryComputer factory : factoryArray) {
			Machine machine = factory.getMachine();
			Chip chip = factory.getChip();
			machine.produce();
			chip.produce();
			System.out.println("---------------------------------");
		}
	}
}
