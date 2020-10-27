package com.css.adapter.baseObject;

/**
 * 被适配的类，已经存在的接口，这个接口需要被适配
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Adaptee {
	public void adapteeRequest() {
		System.out.println("被适配者的方法");
	}
}
