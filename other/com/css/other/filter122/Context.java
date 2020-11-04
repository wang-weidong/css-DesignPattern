package com.css.other.filter122;

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
		str = filter.htmlFilter(str);
		str = filter.sensitiveFilter(str);
		return str;
	}
}
