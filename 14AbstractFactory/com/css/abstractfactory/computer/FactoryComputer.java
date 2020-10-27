package com.css.abstractfactory.computer;

/**
 * 电脑工厂抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public interface FactoryComputer {

	public Machine getMachine();

	public Chip getChip();
}
