package com.css.composite.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		Component composite = new Composite("树枝1");

		Component leaf1 = new Leaf("树枝1树叶1");
		Component leaf2 = new Leaf("树枝1树叶2");
		Component leaf3 = new Leaf("树枝1树叶3");

		composite.add(leaf1);
		composite.add(leaf2);
		composite.add(leaf3);

		Composite composite1 = new Composite("树");

		Component leaf4 = new Leaf("树叶4");
		Component leaf5 = new Leaf("树叶5");

		composite1.add(leaf4);
		composite1.add(leaf5);
		composite1.add(composite);

		composite1.operation();
	}
}
