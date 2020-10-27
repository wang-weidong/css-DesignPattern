package com.css.observer.message;

/**
 * 问题实体类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Question {

	private String userName;

	private String questionContent;

	public Question(String userName, String questionContent) {
		this.userName = userName;
		this.questionContent = questionContent;
	}

	public String getUserName() {
		return userName;
	}

	public String getQuestionContent() {
		return questionContent;
	}

}
