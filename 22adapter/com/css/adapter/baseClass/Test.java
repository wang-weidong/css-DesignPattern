package com.css.adapter.baseClass;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		// 创建符合目标接口的对象
		Target adapterTarget = new Adapter();
		// 请求处理
		adapterTarget.request();
	}
}
