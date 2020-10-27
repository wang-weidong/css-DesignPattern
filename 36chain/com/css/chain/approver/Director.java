package com.css.chain.approver;

/**
 * 主任类：具体处理者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Director extends Approver {
	public Director(String name) {
		super(name);
	}

	// 定义自己的处理逻辑
	public void handleRequest(PurchaseRequest request) {
		handle(request, 300000);
	}
}
