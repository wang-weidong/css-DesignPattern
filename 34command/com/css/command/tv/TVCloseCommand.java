package com.css.command.tv;

/**
 * 关闭命令类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class TVCloseCommand extends Command {
	public TVCloseCommand(Television tv) {
		super(tv);
	}

	public void execute() {
		tv.close();
	}
}