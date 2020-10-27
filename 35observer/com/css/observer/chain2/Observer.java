package com.css.observer.chain2;

/**
 * 观察者 与 被观察者 合并
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Observer {

	/**
	 * 一个观察者
	 */
	protected Observer observer = null;

	/**
	 * 添加一个观察者
	 * 
	 * @param observer
	 */
	public void add(Observer observer) {
		this.observer = observer;
	}

	/**
	 * 通知观察者
	 */
	public void notifyObserver(String message) {
		if (this.observer != null)
			this.observer.response(message);
	}

	/**
	 * 可由子类覆盖
	 */
	public void response(String message) {
	}

}
