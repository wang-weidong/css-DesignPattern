package com.css.proxy.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		// 创建具体类
		Subject realSubject = new RealSubject();
		// 创建代理类
		Subject proxy = new Proxy(realSubject);
		// 代理执行
		proxy.request();
	}
}
