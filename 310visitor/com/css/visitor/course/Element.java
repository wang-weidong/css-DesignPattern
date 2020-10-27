package com.css.visitor.course;

/**
 * 抽象通用组件类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class Element {
	private int level = 0;
	protected String name;

	public int getLevel() {
		return level;
	}

	public String getName() {
		return this.name;
	}

	protected void setLevel(int level) {
		this.level = level;
	}

	public void add(Element catalogComponent) {
		throw new UnsupportedOperationException("不支持添加操作");
	}

	public void remove(Element catalogComponent) {
		throw new UnsupportedOperationException("不支持删除操作");
	}

	public abstract void accept(IVisitor visitor);
}
