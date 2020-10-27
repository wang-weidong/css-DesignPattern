package com.css.chain.approver;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		Approver derector = new Director("张无忌");
		Approver vicePresident = new VicePresident("杨过");
		Approver president = new President("郭靖");
		Approver meeting = new Congress("董事会");

		// 创建职责链
		derector.setNext(vicePresident);
		vicePresident.setNext(president);
		president.setNext(meeting);

		// 创建采购单
		PurchaseRequest pr1 = new PurchaseRequest("购买倚天剑", 10000);
		derector.handleRequest(pr1);

		PurchaseRequest pr2 = new PurchaseRequest("购买《葵花宝典》", 350000);
		derector.handleRequest(pr2);

		PurchaseRequest pr3 = new PurchaseRequest("购买《金刚经》", 6800000);
		derector.handleRequest(pr3);

		PurchaseRequest pr4 = new PurchaseRequest("购买桃花岛", 20000000);
		derector.handleRequest(pr4);
	}
}
