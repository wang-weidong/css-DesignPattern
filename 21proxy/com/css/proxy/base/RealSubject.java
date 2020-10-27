package com.css.proxy.base;

/**
 * 具体实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class RealSubject implements Subject {
	@Override
	public void request() {
		System.out.println("具体实现: request");
	}
}
