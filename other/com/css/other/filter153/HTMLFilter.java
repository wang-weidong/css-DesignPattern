package com.css.other.filter153;

/**
 * HTML过滤器实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class HTMLFilter extends Filter {

	@Override
	protected String handle(String str) {
		return str.replace('<', '[').replace('>', ']');
	}
}
