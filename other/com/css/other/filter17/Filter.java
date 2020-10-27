package com.css.other.filter17;

import java.util.Stack;

/**
 * 过滤解析环境类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Filter {
	private Node node;

	public void build(String statement) {
		Stack<Node> stack = new Stack<>();
		String[] statementArr = statement.split("@");

		for (int i = 0; i < statementArr.length; i++) {
			if (statementArr[i].equalsIgnoreCase("html")) {
				Node top = (Node) stack.pop();
				stack.push(new HTMLNode(top));
			} else if (statementArr[i].equalsIgnoreCase("sensitive")) {
				Node top = (Node) stack.pop();
				stack.push(new SensitiveNode(top));
			} else {
				stack.push(new ValueNode(statementArr[i]));
			}
		}

		this.node = (Node) stack.pop();
	}

	public String compute() {
		return node.doFilter();
	}
}
