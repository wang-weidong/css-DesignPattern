package com.css.mediator.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象中介者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Mediator {
	/**
	 * 被中介者代理的同事
	 */
	protected List<Colleague> colleagues = new ArrayList<>();

	// 注册同事
	public void register(Colleague colleague) {
		if (!colleagues.contains(colleague))
			this.colleagues.add(colleague);
	}

	// 通知中介者，发送消息
	public abstract void relay(Colleague colleague, String message);

}
