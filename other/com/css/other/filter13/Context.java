package com.css.other.filter13;

/**
 * 状态环境类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Context {
	private String message;
	private Filter filter;

	public Context(Filter filter, String message) {
		this.filter = filter;
		this.message = message;
	}

	public String handle() {
		message = filter.doFilter(this, message);
		return message;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}
}
