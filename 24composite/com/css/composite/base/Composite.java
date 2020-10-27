package com.css.composite.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 复杂的组合容器类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Composite implements Component {

	private String name;

	private List<Component> components = new ArrayList<>();

	public Composite(String name) {
		this.name = name;
	}

	public void add(Component component) {
		components.add(component);
	}

	public void remove(Component component) {
		components.remove(component);
	}

	public Component get(int index) {
		return components.get(index);
	}

	@Override
	public void operation() {
		System.out.println(this.name);
		for (Component component : components) {
			component.operation();
		}
	}
}
