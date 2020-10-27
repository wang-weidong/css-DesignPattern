package com.css.interpreter.calculator;

/**
 * 值型节点类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ValueNode implements Node {
	private int value;

	public ValueNode(int value) {
		this.value = value;
	}

	public int interpret() {
		return this.value;
	}
}