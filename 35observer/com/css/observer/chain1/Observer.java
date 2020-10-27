package com.css.observer.chain1;

/**
 * 抽象观察者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public interface Observer {
	public void response(String message);

	public void add(Observer observer);
}
