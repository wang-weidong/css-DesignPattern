package com.css.chain.base1;

/**
 * 流水线类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Pipeline {
	private Handler head = null;
	private Handler tail = null;

	public void add(Handler handler) {
		if (head == null)
			head = handler;
		else
			tail.setNext(handler);
		tail = handler;
	}

	public void handle(String request, int condition) {
		if (head != null)
			head.handle(request, condition);
	}

}
