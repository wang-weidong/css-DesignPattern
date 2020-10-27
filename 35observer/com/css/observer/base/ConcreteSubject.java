package com.css.observer.base;

import java.util.ArrayList;

/**
 * 被观察者-具体主体类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ConcreteSubject extends Subject {

	public ConcreteSubject() {
		super.observers = new ArrayList<>();
	}

	@Override
	public void add(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObserver(String message) {
		for (Observer observer : this.observers) {
			observer.response(message);
		}
	}
}
