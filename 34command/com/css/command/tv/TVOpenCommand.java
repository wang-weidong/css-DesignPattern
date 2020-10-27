package com.css.command.tv;

/**
 * 打开命令类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class TVOpenCommand extends Command {
	public TVOpenCommand(Television tv) {
		super(tv);
	}

	public void execute() {
		tv.open();
	}
}