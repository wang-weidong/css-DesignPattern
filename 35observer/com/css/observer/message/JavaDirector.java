package com.css.observer.message;

/**
 * 具体观察者类-java系主任
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class JavaDirector extends Teacher {

	public JavaDirector(String teacherName) {
		super(teacherName);
		this.teacherType = "主任";
	}

}
