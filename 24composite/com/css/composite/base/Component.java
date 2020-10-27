package com.css.composite.base;

/**
 * 组合模式统一接口类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public interface Component {
	public void operation();

	public void add(Component leaf);
}
