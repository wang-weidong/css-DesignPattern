package com.css.other.filter13;

/**
 * 过滤器工厂类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Factory {
	public final static Filter HTML_FILTER = new HTMLFilter();
	public final static Filter SENSITIVE_FILTER = new SensitiveFilter();
}
