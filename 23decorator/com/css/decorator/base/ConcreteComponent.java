package com.css.decorator.base;

/**
 * 具体组件的具体实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteComponent implements Component {
	// 具体实现
	@Override
	public void operate() {
		System.out.println("do Something");
	}

}
