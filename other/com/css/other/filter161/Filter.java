package com.css.other.filter161;

/**
 * 过滤处理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Filter {
	public Filter nextFilter = null;

	public void setNext(Filter filter) {
		this.nextFilter = filter;
	}

	public String doNext(String str) {
		if (this.nextFilter != null)
			str = this.nextFilter.doFilter(str);
		return str;
	}

	public String doFilter(String str) {
		return doNext(str);
	}
}
