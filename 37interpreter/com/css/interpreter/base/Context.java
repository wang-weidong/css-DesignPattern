package com.css.interpreter.base;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类Context
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Context {
	private Map<String, String> map = new HashMap<>();

	public void assign(String key, String value) {
		// 往环境类中设值
	}

	public String lookup(String key) {
		// 获取存储在环境类中的值
		return map.get(key);
	}

}
