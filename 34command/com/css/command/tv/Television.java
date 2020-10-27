package com.css.command.tv;

/**
 * 电视机操作类-命令接收者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Television {
	public void open() {
		System.out.println("打开电视机！");
	}

	public void close() {
		System.out.println("关闭电视机！");
	}

	public void change() {
		System.out.println("切换电视频道！");
	}
}