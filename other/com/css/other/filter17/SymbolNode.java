package com.css.other.filter17;

/**
 * 命令符号型节点类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class SymbolNode implements Node {
	protected Node node;

	public SymbolNode(Node node) {
		this.node = node;
	}
}