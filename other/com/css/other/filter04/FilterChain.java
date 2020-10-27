package com.css.other.filter04;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FilterChain {
	List<Filter> filters = new ArrayList<Filter>();

	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;
	}

	public String doFilter(String str) {
		for (Filter f : filters)
			str = f.doFilter(str);
		return str;
	}
}
