package com.css.other.filter06;

/**
 * HTML过滤器具体装饰类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class HTMLFilter extends Filter {

	public HTMLFilter(Filter filter) {
		super(filter);
	}

	@Override
	public String doFilter(String str) {
		str = str.replace('<', '[').replace('>', ']');
		return super.doFilter(str);
	}
}
