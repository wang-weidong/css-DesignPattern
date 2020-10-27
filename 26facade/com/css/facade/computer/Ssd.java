package com.css.facade.computer;

/**
 * 硬盘实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Ssd implements Accessories {
	@Override
	public void open() {
		System.out.println("启动硬盘");
	}
}