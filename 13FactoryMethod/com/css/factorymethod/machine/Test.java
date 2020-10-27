package com.css.factorymethod.machine;

/**
 * 测试，为了培训好看命名未按规范起
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		FactoryMachine videoFactory = new FactoryMachineGreatwall();
		Machine video1 = videoFactory.getMachine();
		video1.produce();

		videoFactory = new FactoryMachineLenovo();
		Machine video2 = videoFactory.getMachine();
		video2.produce();
	}
}
