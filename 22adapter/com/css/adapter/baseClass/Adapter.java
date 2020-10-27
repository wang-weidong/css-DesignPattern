package com.css.adapter.baseClass;

/**
 * 适配器，继承了被适配的类，并且实现了Target定义的接口
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Adapter extends Adaptee implements Target {
	@Override
	public void request() {
		System.out.println("before");
		super.adapteeRequest();
		System.out.println("after");
	}
}
