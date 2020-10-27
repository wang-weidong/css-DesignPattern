package com.css.chain.base;

/**
 * 抽象处理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Handler {
	public Handler successor;

	// 设置下一个处理者是谁
	public void setNext(Handler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(String request, int condition);
}
