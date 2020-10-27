package com.css.other.filter17;

/**
 * 值型节点类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ValueNode implements Node {
	private String value;

	public ValueNode(String value) {
		this.value = value;
	}

	public String doFilter() {
		return this.value;
	}
}