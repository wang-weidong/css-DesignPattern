package com.css.other.filter07;

/**
 * 过滤器组件构件
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public interface Filter {
	public String doFilter(String str);

	public void addFilter(Filter filter);
}
