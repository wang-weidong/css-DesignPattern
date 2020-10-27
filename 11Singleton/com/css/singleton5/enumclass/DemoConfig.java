package com.css.singleton5.enumclass;

import java.util.ArrayList;
import java.util.List;

/**
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class DemoConfig {
	private List<String> list;

	public DemoConfig(int number) {
		list = new ArrayList<>();
		for (int i = 0; i < number; i++)
			list.add("message-" + i);
	}

	public String getData(int index) {
		return list.get(index);
	}

}
