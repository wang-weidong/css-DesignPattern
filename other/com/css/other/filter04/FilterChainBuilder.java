package com.css.other.filter04;

/**
 * 过滤链建造者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FilterChainBuilder {
	private FilterChain chain = new FilterChain();

	public FilterChain getFilterChain() {
		return chain;
	}

	public FilterChain build() {
		return this.chain.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());
	}
}