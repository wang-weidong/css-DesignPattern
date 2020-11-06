package com.css.other.filter162;

/**
 * 过滤链流水线类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FilterChain {
	private Filter head = null;
	private Filter tail = null;

	public void add(Filter filter) {
		if (head == null)
			head = filter;
		else
			tail.setNext(filter);
		tail = filter;
	}

	public String doFilter(String str) {
		return head != null ? head.doFilter(str) : str;
	}
}
