package com.css.visitor.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Client {
	Visitor visitor;
	List<Element> elements = new ArrayList<>();

	public Client() {
		this.initStructure();
	}

	public void initStructure() {
		// 初始化元素
		Element element1 = new ConcreteElementA();
		Element element2 = new ConcreteElementB();
		// 装填
		elements.add(element1);
		elements.add(element2);

	}

	public void accept(Visitor visitor) {
		// 访问
		elements.forEach(e -> e.accept(visitor));
	}

	public static void main(String[] args) {
		Visitor visior1 = new ConcreteVisitor1();
		Visitor visior2 = new ConcreteVisitor2();

		Client test = new Client();
		test.accept(visior1);
		test.accept(visior2);
	}

}
