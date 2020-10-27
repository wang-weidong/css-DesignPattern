package com.css.other.filter08;

import java.util.HashMap;

/**
 * 过滤器享元对象工厂类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FilterFactory {
	private static final FilterFactory INSTANCE = new FilterFactory();
	private static final HashMap<String, Filter> filterMaps = new HashMap<>();
	static {
		filterMaps.put("html", new HTMLFilter());
		filterMaps.put("sensitive", new SensitiveFilter());
	}

	public static FilterFactory getFactory() {
		return INSTANCE;
	}

	public Filter getFilter(String type) {
		return filterMaps.get(type);
	}
}
