package com.css.observer.message;

import java.util.Observable;
import java.util.Observer;

/**
 * 抽象观察者类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Teacher implements Observer {
	protected String teacherType;
	protected String teacherName;

	public Teacher(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public void update(Observable o, Object arg) {
		Subject subject = (Subject) o;
		Question question = (Question) arg;

		System.out.println(teacherName + teacherType + "在“" + subject.getName() + "”课程接收到“" + question.getUserName()
				+ "”提出的问题：“" + question.getQuestionContent() + "”");
	}

}
