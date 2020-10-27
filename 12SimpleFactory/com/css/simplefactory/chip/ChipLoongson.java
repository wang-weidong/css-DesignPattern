package com.css.simplefactory.chip;

/**
 * 龙芯芯片实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ChipLoongson extends Chip {
	@Override
	public void produce() {
		System.out.println("生产龙芯芯片");
	}
}
