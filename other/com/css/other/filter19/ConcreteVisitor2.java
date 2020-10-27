package com.css.other.filter19;

/**
 * 具体的访问者实现
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ConcreteVisitor2 implements Visitor {
	@Override
	public void visit(Element element) {
		String message = element.getMessage();
		message = htmlFilter(message);
		message = sensitiveFilter(message);
		System.out.println(message);
	}

	public String htmlFilter(String str) {
		return str.replace('<', '[').replace('>', ']');
	}

	public String sensitiveFilter(String str) {
		return str.replace("敏感词1", "好词1").replace("敏感词3", "好词3");
	}
}
