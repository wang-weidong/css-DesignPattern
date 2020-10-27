package com.css.chain.approver;

/**
 * 抽象处理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Approver {
	public Approver successor;
	protected String name; // 审批者姓名

	public Approver(String name) {
		this.name = name;
	}

	// 设置下一个审批者是谁
	public void setNext(Approver successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(PurchaseRequest request);

	public void handle(PurchaseRequest request, int amount) {
		if (request.getAmount() <= amount) {
			System.out.println(this.getClass().getSimpleName() + ": " + name + "审批： " + request.toString());
		} else {// 不满足条件则转发请求
			if (this.successor != null)
				this.successor.handleRequest(request);
		}
	}
}
