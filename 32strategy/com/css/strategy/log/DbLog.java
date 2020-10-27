package com.css.strategy.log;

/**
 * 把日志记录到数据库
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class DbLog implements LogStrategy {
	public void log(String msg) {
		if (msg != null && msg.trim().length() > 5) {
			throw new RuntimeException("数据库出错了");
		}
		System.out.println("把 '" + msg + "' 记录到数据库中");
	}
}
