package com.css.strategy.log;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {
	public static void main(String[] args) {
		LogContext log = new LogContext();
		log.log("记日志");
		log.log("这是一个长记录日志1");
		log.log("记录日志");
		log.log("这是一个长记录日志2");
	}
}
