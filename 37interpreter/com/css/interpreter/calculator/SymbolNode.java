package com.css.interpreter.calculator;

/**
 * 命令符号型节点类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class SymbolNode implements Node {
	protected Node left;
	protected Node right;

	public SymbolNode(Node left, Node right) {
		this.left = left;
		this.right = right;
	}
}