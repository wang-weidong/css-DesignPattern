package com.css.other.filter141;

/**
 * 命令执行者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Invoker {

	private Filter command;

	public void setCommand(Filter command) {
		this.command = command;
	}

	public String execute(String str) {
		return command.doFilter(str);
	}
}
