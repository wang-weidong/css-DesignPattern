package com.css.other.filter19;

/**
 * 访问者接口
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public interface Visitor {

	/**
	 * 相当于给元素添加访问者的功能
	 */
	public void visit(Element element);

}
