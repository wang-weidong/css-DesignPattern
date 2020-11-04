package com.css.other.filter09;

/**
 * 过滤器统一入口工具类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FilterUtils {
	private static HTMLFilter f1 = new HTMLFilter();
	private static SensitiveFilter f2 = new SensitiveFilter();

	public String htmlFilter(String str) {
		return f1.doFilter(str);
	}

	public String sensitiveFilter(String str) {
		return f2.doFilter(str);
	}
}
