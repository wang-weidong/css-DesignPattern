package com.css.observer.base;

import java.util.List;

/**
 * 被观察者-抽象主题类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Subject {

	/**
	 * 观察者数组
	 */
	protected List<Observer> observers;

	/**
	 * 添加一个观察者
	 * 
	 * @param observer
	 */
	public abstract void add(Observer observer);

	/**
	 * 删除一个观察者
	 * 
	 * @param observer
	 */
	public abstract void remove(Observer observer);

	/**
	 * 通知观察者
	 */
	public abstract void notifyObserver(String message);
}
