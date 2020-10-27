package com.css.other.filter11;

/**
 * 过滤处理抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class AbstractHandler {

	public String handle(String str) {
		str = htmlFilter(str);
		str = sensitiveFilter(str);
		return str;
	}

	public abstract String htmlFilter(String str);

	public abstract String sensitiveFilter(String str);
}
