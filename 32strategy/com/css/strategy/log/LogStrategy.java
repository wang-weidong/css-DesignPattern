package com.css.strategy.log;

/**
 * 日志记录策略的接口
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public interface LogStrategy {
	/**
	 * 记录日志
	 * 
	 * @param msg 需记录的日志信息
	 */
	public void log(String msg);
}
