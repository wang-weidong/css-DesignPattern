package com.css.memento.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Client {
	public static void main(String[] args) {
		// 备忘录管理
		Caretaker caretaker = new Caretaker();

		// 发起人
		Originator originator = new Originator("1");

		// 创建备忘录1
		Memento memento1 = originator.createMemento();
		caretaker.addMemento(memento1);

		// 修改并创建备忘录2
		originator.setStatus("2");
		Memento memento2 = originator.createMemento();
		caretaker.addMemento(memento2);

		// 修改状态3
		originator.setStatus("3");
		System.out.println(originator.getStatus());

		// 回滚上一次
		originator.restoreMemento(caretaker.getMemento());
		System.out.println(originator.getStatus());

		// 回滚上一次
		originator.restoreMemento(caretaker.getMemento());
		System.out.println(originator.getStatus());
	}
}