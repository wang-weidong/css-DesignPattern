package com.css.other.filter01;

/**
 * HTML过滤器工厂实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class HTMLFilterFactory extends FilterFactory {

	@Override
	public Filter getFilter() {
		return new HTMLFilter();
	}
}
