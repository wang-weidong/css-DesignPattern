package com.css.observer.chain3;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者 与 被观察者 合并
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Observer {
	protected String name = "";
	/**
	 * 观察者列表
	 */
	protected List<Observer> observers = new ArrayList<>();

	public Observer(String name) {
		this.name = name;
	}

	/**
	 * 添加一个观察者
	 * 
	 * @param observer
	 */
	public void add(Observer observer) {
		this.observers.add(observer);
	}

	/**
	 * 通知观察者
	 */
	public void notifyObserver(String message) {
		for (Observer observer : this.observers) {
			observer.response(message, this.name);
		}
	}

	/**
	 * 可由子类覆盖
	 */
	public void response(String message, String from) {
	}

}
