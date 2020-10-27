package com.css.interpreter.base;

import java.util.Stack;

/**
 * 客户封装类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Client {

	public static void main(String[] args) {
		Context ctx = new Context();
		// 通常定一个语法容器，容纳一个具体的表达式，通常为ListArray,LinkedList,Stack等类型
		Stack<AbstractExpression> stack = new Stack<>();
		/*
		 * for(;;){ //进行语法判断，并产生递归调用 }
		 */
		// 产生一个完整的语法树，由各各个具体的语法分析进行解析
		AbstractExpression exp = stack.pop();

		// 具体元素进入场景
		exp.interpret(ctx);
	}
}
