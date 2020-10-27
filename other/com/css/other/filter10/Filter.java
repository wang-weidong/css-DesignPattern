package com.css.other.filter10;

/**
 * 过滤器实现类接口
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public interface Filter {
	public String htmlFilter(String str);

	public String sensitiveFilter(String str);
}
