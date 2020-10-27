package com.css.other.filter05;

/**
 * 过滤器对象代理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FilterChain implements Filter {
	private Filter filter;

	public FilterChain(Filter filter) {
		this.filter = filter;
	}

	@Override
	public String doFilter(String str) {
		str = filter.doFilter(str);
		return SensitiveFilter(str);
	}

	public String SensitiveFilter(String str) {
		return str.replace("敏感词1", "好词1").replace("敏感词2", "好词2").replace("王伟东", "Wang Weidong");
	}
}
