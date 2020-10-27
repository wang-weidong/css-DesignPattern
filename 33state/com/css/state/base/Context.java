package com.css.state.base;

/**
 * 状态上下文 维护一个state实例，这个为实体当前的状态
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Context {

	/**
	 * 当前的状态
	 */
	private State state;

	/**
	 * 构造函数
	 * 
	 * @param state
	 */
	public Context(State state) {
		this.state = state;
	}

	/**
	 * 请求状态
	 */
	public void request() {
		state.handle(this);
	}

	public void setState(State state) {
		this.state = state;
	}
}
