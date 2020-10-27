package com.css.other.filter151;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FilterChain {
	List<Filter> filters = new ArrayList<Filter>();

	public void addFilter(Filter f) {
		this.filters.add(f);
	}

	public String doFilter(String str) {
		for (Filter f : filters)
			str = f.doFilter(str);
		return str;
	}
}
