package com.css.interpreter.base;

/**
 * 包含两个操作元素的非终结符表达式类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class NonterminalExpression extends AbstractExpression {

	protected AbstractExpression left;
	protected AbstractExpression right;

	public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
		this.left = left;
		this.right = right;
	}

	public void interpret(Context ctx) {
		// 递归调用每一个组成部分的interpret()方法
		// 在递归调用时指定组成部分的连接方式，即非终结符的功能
	}

}
