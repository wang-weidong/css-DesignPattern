package com.css.abstractfactory.computer;

/**
 * 龙芯电脑工厂实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */

public class FactoryLoogson implements FactoryComputer {
	@Override
	public Machine getMachine() {
		return new MachineLenovo();
	}

	@Override
	public Chip getChip() {
		return new ChipLoongson();
	}
}
