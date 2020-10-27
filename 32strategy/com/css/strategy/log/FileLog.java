package com.css.strategy.log;

/**
 * 把日志记录到文件
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class FileLog implements LogStrategy {
	public void log(String msg) {
		System.out.println("把 '" + msg + "' 记录到文件中");
	}
}
