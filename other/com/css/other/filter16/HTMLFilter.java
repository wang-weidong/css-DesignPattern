package com.css.other.filter16;

/**
 * HTML过滤处理实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class HTMLFilter extends Filter {

	@Override
	public String doFilter(String str) {
		str = str.replace('<', '[').replace('>', ']');
		return super.doNext(str);
	}
}
