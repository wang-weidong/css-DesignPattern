package com.css.visitor.base;

/**
 * 抽象访问者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public interface Visitor {

	/**
	 * 访问A，相当于给元素A添加访问者的功能
	 * 
	 * @param element
	 */
	public void visitA(ConcreteElementA element);

	/**
	 * 访问B，相当于给元素B添加访问者的功能
	 * 
	 * @param element
	 */
	public void visitB(ConcreteElementB element);

}
