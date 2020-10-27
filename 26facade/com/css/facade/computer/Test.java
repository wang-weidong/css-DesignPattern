package com.css.facade.computer;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {
	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.openDDR();
		computer.openCPU();
		computer.openSSD();
		System.out.println("=========================");
		computer.open();
	}

}
