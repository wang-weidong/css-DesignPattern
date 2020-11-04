package com.css.chain.base1;

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
	protected void setNext(Handler successor) {
		this.successor = successor;
	}
	
	public void handle(String request, int condition) {
		if (checkCondition(condition)) 
		{
			handleRequest(request);
		} 
		else 
		{
			if (this.successor != null)
				this.successor.handle(request, condition);
		}
	}

	protected abstract boolean checkCondition(int condition);

	protected abstract void handleRequest(String request);
}
