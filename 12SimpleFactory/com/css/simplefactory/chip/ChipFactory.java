package com.css.simplefactory.chip;

/**
 * 芯片工厂-反射方式实现
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ChipFactory {
	public Chip getChip(Class<?> clazz) {
		Chip chip = null;
		try {
			chip = (Chip) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chip;
	}
}
