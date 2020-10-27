package com.css.other.filter03;

/**
 * 过滤器抽象工厂类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class Factory {

	public abstract Filter getHTMLFilter();

	public abstract Filter getSensitiveFilter();

}
