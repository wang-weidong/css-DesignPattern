package com.css.mediator.message;

import java.util.ArrayList;
import java.util.List;

/***
 * 消息处理-具体中介者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class MessageMediator extends Mediator {
	/**
	 * 被中介者代理的同事
	 */
	private List<AbstractUser> colleagues;

	public MessageMediator() {
		colleagues = new ArrayList<>();
	}

	@Override
	public void register(AbstractUser user) {
		if (!colleagues.contains(user)) {
			user.setMediator(this);
			this.colleagues.add(user);
		}
	}

	@Override
	public void relay(AbstractUser from, String message) {
		for (AbstractUser to : colleagues) {
			if (!to.equals(from)) {
				to.receive(from, message);
			}
		}
	}

	@Override
	public void relayTo(AbstractUser from, AbstractUser to, String message) {
		to.receive(from, message);
	}

}
