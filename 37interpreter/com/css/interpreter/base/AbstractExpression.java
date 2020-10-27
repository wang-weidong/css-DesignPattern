package com.css.interpreter.base;

/**
 * 抽象表达式类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public abstract class AbstractExpression {
	public abstract void interpret(Context ctx);
}