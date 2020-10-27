package com.css.composite.course;

/**
 * 通用的组件抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class Element {
	protected int level = 0;
	protected String name;

	public void printBlank() {
		for (int i = 0; i < this.level; i++)
			System.out.print("　　");
	}

	public String getName() {
		return this.name;
	}

	public void add(Element component) {
		throw new UnsupportedOperationException("不支持添加操作");
	}

	public void remove(Element component) {
		throw new UnsupportedOperationException("不支持删除操作");
	}

	public double getPrice() {
		throw new UnsupportedOperationException("不支持获取价钱操作");
	}

	public abstract void print();

}
