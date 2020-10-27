package com.css.facade.computer;

/**
 * 门面类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ComputerFacade {
	private Accessories cpu = new Cpu();
	private Accessories ddr = new Ddr();
	private Accessories ssd = new Ssd();

	public void open() {
		this.openCPU();
		this.openDDR();
		this.openSSD();
	}

	/** * 启动cpu */
	public void openCPU() {
		cpu.open();
	}

	/** * 启动内存 */
	public void openDDR() {
		ddr.open();
	}

	/** * 启动硬盘 */
	public void openSSD() {
		ssd.open();
	}
}