package com.css.chain.approver;

/**
 * 副董事长类：具体处理者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class VicePresident extends Approver {
	public VicePresident(String name) {
		super(name);
	}

	// 定义自己的处理逻辑
	public void handleRequest(PurchaseRequest request) {
		handle(request, 3000000);
	}
}
