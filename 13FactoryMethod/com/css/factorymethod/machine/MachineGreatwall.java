package com.css.factorymethod.machine;

/**
 * 长城主机实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class MachineGreatwall extends Machine {

	@Override
	public void produce() {
		System.out.println("生产长城主机");
	}
}
