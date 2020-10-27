package com.css.observer.message;

import java.util.Observable;

/**
 * 被观察者-主题类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Subject extends Observable {

	private String name;

	public Subject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void produceQuestion(Question question) {
		System.out.println(question.getUserName() + "在" + this.name + "提交了一个问题。");
		setChanged();
		notifyObservers(question);
	}
}
