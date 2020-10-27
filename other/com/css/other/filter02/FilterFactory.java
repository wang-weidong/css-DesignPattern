package com.css.other.filter02;

/**
 * 过滤器工厂类，反射方式实现
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FilterFactory {

	public static Filter getFilter(Class<?> clazz) {
		Filter filter = null;
		try {
			filter = (Filter) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filter;
	}
}
