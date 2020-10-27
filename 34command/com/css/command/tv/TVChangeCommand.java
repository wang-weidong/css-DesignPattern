package com.css.command.tv;

/**
 * 换台命令类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class TVChangeCommand extends Command {
	public TVChangeCommand(Television tv) {
		super(tv);
	}

	public void execute() {
		tv.change();
	}
}