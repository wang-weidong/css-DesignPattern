package com.css.other.filter06;

/**
 * 过滤抽象装饰器类、组件类合二为一
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Filter {
	public Filter filter = null;

	public Filter() {
	}

	public Filter(Filter filter) {
		this.filter = filter;
	}

	public String doFilter(String str) {
		if (this.filter != null)
			str = this.filter.doFilter(str);
		return str;
	}
}
