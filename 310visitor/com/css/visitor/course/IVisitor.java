package com.css.visitor.course;

/**
 * 抽象访问者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public interface IVisitor {

	public void visitCatalog(CourseCatalog catalog);

	public void visitCourse(Course course);
}
