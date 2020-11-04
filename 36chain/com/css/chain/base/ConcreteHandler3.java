package com.css.chain.base;

/**
 * 具体处理者类3
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteHandler3 extends Handler {
	// 定义自己的处理逻辑
	public void handleRequest(String request, int condition) {
		if (condition == 3) {
			System.out.println(this.getClass().getSimpleName() + "处理请求: " + request);
		} else {// 不满足条件则转发请求
			if (this.successor != null)
				this.successor.handleRequest(request, condition);
		}
	}
}