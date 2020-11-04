package com.css.other.filter10;

/**
 * 过滤处理修正抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ConcreteHandler extends AbstractHandler {

	public ConcreteHandler(Filter filter) {
		super(filter);
	}

	public String handle(String str) {
		str = filter.htmlFilter(str);
		str = filter.sensitiveFilter(str);
		return str;
	}
}
