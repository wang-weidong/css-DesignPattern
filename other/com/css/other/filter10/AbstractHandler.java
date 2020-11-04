package com.css.other.filter10;

/**
 * 过滤处理抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class AbstractHandler {
	/**
	 * 关联对象
	 */
	protected Filter filter;


	public AbstractHandler(Filter filter) {
		this.filter = filter;
	}

	public abstract String handle(String str);
}
