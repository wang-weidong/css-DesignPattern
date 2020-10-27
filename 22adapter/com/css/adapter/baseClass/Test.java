package com.css.adapter.baseClass;

/**
 * 测试类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		Target adapterTarget = new Adapter();
		adapterTarget.request();
	}
}
