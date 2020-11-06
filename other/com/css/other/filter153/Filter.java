package com.css.other.filter153;

/**
 * 抽象处理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class Filter {
	public Filter nextFilter;

	// 设置下一个处理者是谁
	protected void setNext(Filter nextFilter) {
		this.nextFilter = nextFilter;
	}

	public String doFilter(String str) {
		str = handle(str);
		if (this.nextFilter != null)
			str = this.nextFilter.doFilter(str);
		return str;
	}

	protected abstract String handle(String str);
}
