package com.css.observer.chain1;

/**
 * 被观察者-主题类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Subject {

	/**
	 * 观察者数组
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

}
