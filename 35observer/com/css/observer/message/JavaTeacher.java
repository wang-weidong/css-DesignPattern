package com.css.observer.message;

/**
 * 具体观察者类-Java课老师
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class JavaTeacher extends Teacher {

	public JavaTeacher(String teacherName) {
		super(teacherName);
		this.teacherType = "老师";
	}
}
