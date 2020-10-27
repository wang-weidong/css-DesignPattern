package com.css.visitor.course;

/**
 * 具体访问者1
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Visitor1 implements IVisitor {

	public void printBlank(Element component) {
		for (int i = 0; i < component.getLevel(); i++)
			System.out.print("　　");
	}

	@Override
	public void visitCatalog(CourseCatalog catalog) {
		printBlank(catalog);
		System.out.println(catalog.getName());
		for (Element catalogComponent : catalog.getItems())
			catalogComponent.accept(this);
	}

	@Override
	public void visitCourse(Course course) {
		printBlank(course);
		System.out.println("Course Name: " + course.getName() + ", Price: " + course.getPrice());
	}
}
