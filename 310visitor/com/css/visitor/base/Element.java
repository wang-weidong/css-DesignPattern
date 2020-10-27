package com.css.visitor.base;

/**
 * 抽象组件类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public interface Element {

	public void accept(Visitor visitor);

	public String operation();
}
