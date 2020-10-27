package com.css.factorymethod.machine;

/**
 * 联想主机工厂实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FactoryMachineLenovo extends FactoryMachine {

	@Override
	public Machine getMachine() {
		return new MachineLenovo();
	}
}
