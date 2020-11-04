package com.css.chain.base1;

/**
 * 具体处理者类1
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteHandler1 extends Handler {
	
	@Override
	protected boolean checkCondition(int condition) {
		return condition==1;
	}

	@Override
	protected void handleRequest(String request) {
		System.out.println(this.getClass().getSimpleName() + "处理请求: " + request);
	}
}
