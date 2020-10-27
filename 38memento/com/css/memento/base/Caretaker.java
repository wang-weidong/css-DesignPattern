package com.css.memento.base;

import java.util.Stack;

/**
 * 备忘录管理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Caretaker {

	/**
	 * 备忘录记录栈
	 */
	private Stack<Memento> MEMENTO_STACK;

	public Caretaker() {
		MEMENTO_STACK = new Stack<>();
	}

	/**
	 * 添加一个备忘录
	 * 
	 * @param memento
	 */
	public void addMemento(Memento memento) {
		MEMENTO_STACK.push(memento);
	}

	/**
	 * 获取一个备忘录
	 * 
	 * @return
	 */
	public Memento getMemento() {
		return MEMENTO_STACK.pop();
	}

}
