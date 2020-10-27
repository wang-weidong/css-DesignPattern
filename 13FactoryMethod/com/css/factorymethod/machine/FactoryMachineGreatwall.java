package com.css.factorymethod.machine;

/**
 * 长城主机工厂实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FactoryMachineGreatwall extends FactoryMachine {
	@Override
	public Machine getMachine() {
		return new MachineGreatwall();
	}
}
