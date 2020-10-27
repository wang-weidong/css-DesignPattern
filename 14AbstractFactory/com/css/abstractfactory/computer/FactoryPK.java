package com.css.abstractfactory.computer;

/**
 * 飞腾电脑工厂实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */

public class FactoryPK implements FactoryComputer {
	@Override
	public Machine getMachine() {
		return new MachineGreatwall();
	}

	@Override
	public Chip getChip() {
		return new ChipPhytium();
	}
}
