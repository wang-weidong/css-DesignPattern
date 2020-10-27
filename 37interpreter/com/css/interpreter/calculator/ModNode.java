package com.css.interpreter.calculator;

/**
 * 取余实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ModNode extends SymbolNode {
	public ModNode(Node left, Node right) {
		super(left, right);
	}

	public int interpret() {
		return super.left.interpret() % super.right.interpret();
	}
}