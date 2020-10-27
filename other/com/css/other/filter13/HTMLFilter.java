package com.css.other.filter13;

/**
 * HTML过滤器实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class HTMLFilter implements Filter {

	@Override
	public String doFilter(Context context, String str) {
		str = str.replace('<', '[').replace('>', ']');
		context.setFilter(Factory.SENSITIVE_FILTER);
		return str;
	}
}
