package com.css.other.filter07;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链容器构件
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<Filter>();

	public void addFilter(Filter f) {
		this.filters.add(f);
	}

	@Override
	public String doFilter(String str) {
		for (Filter f : filters)
			str = f.doFilter(str);
		return str;
	}
}
