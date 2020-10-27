package com.css.other.filter07;

/**
 * HTML过滤器子构件实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class HTMLFilter implements Filter {

	@Override
	public String doFilter(String str) {
		return str.replace('<', '[').replace('>', ']');
	}

	@Override
	public void addFilter(Filter filter) {
		throw new UnsupportedOperationException("不支持添加操作");
	}
}
