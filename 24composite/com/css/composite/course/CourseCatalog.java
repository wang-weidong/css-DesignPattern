package com.css.composite.course;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录容器组件实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class CourseCatalog extends Element {
	private List<Element> items = new ArrayList<Element>();

	public CourseCatalog(String name) {
		this.name = name;
	}

	@Override
	public void add(Element catalogComponent) {
		catalogComponent.level = this.level + 1;
		items.add(catalogComponent);
	}

	@Override
	public void remove(Element catalogComponent) {
		items.remove(catalogComponent);
	}

	@Override
	public void print() {
		printBlank();
		System.out.println(this.name);
		for (Element catalogComponent : items)
			catalogComponent.print();
	}

}
