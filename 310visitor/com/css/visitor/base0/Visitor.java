package com.css.visitor.base0;

/**
 * 抽象访问者
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
	public void visitA(Element element);

}
