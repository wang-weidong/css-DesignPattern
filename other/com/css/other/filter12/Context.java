package com.css.other.filter12;

/**
 * 环境类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Context {
	private Filter filter;

	public Context(Filter filter) {
		this.filter = filter;
	}

	public String handle(String str) {
		return filter.doFilter(str);
	}
}
