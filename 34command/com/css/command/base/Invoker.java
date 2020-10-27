package com.css.command.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令执行者/调用者
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Invoker {

	private List<Command> commands = new ArrayList<>();

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void execute() {
		commands.forEach(Command::execute);
		commands.clear();
	}
}
