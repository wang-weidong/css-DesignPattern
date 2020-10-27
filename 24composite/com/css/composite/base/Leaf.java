package com.css.composite.base;

/**
 * 简单的组件类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Leaf implements Component {

	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		System.out.println(this.name);
	}

	public String getName() {
		return name;
	}

	@Override
	public void add(Component leaf) {
	}
}
