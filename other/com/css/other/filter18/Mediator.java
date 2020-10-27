package com.css.other.filter18;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class Mediator {
	/**
	 * 被中介者代理的同事
	 */
	protected List<AbstractUser> users = new ArrayList<>();

	// 注册同事
	public void register(AbstractUser user) {
		if (!users.contains(user)) {
			this.users.add(user);
			user.setMediator(this);
		}
	}

	// 中介，转发消息
	public abstract void relay(AbstractUser fromUser, String message);

}
