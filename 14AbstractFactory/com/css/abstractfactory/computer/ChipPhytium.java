package com.css.abstractfactory.computer;

/**
 * 飞腾芯片实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ChipPhytium extends Chip {
	@Override
	public void produce() {
		System.out.println("生产飞腾芯片");
	}
}
