package com.css.abstractfactory.computer;

/**
 * 联想主机实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class MachineLenovo extends Machine {
	@Override
	public void produce() {
		System.out.println("生产联想主机");
	}
}
