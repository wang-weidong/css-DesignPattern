package com.css.proxy.base;

/**
 * 代理类，静态代理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Proxy implements Subject {

	private Subject subject;

	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		System.out.println("before");
		subject.request();
		System.out.println("after");
	}

}
