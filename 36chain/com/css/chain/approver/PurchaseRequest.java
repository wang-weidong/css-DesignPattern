package com.css.chain.approver;

/**
 * 采购实体类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class PurchaseRequest {
	private String desc;
	private int amount;

	public PurchaseRequest(String desc, int amount) {
		this.desc = desc;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return desc + ", 金额：" + amount;
	}

}
