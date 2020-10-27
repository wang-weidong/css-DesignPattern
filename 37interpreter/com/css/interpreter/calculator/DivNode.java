package com.css.interpreter.calculator;

/**
 * 除法实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class DivNode extends SymbolNode {
	public DivNode(Node left, Node right) {
		super(left, right);
	}

	public int interpret() {
		return super.left.interpret() / super.right.interpret();
	}
}