package com.css.state.forum;

/**
 * 论坛帐号--Context上下文类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ForumAccount {

	private AbstractState state;
	private String name;
	private int point;

	public ForumAccount(String name) {
		this.name = name;
		this.state = State.PRIMARY;
		System.out.println(this.name + "注册成功！");
		System.out.println("---------------------------------------------");
	}

	public void printInfo() {
		System.out.println("剩余积分为：" + this.point + "，当前级别为：" + state.stateName + "。");
	}

	public void setState(AbstractState state) {
		this.state = state;
	}

	public AbstractState getState() {
		return this.state;
	}

	public void downloadFile(int score) {
		state.downloadFile(this, score);
	}

	public void writeNote(int score) {
		state.writeNote(this, score);
	}

	public void replyNote(int score) {
		state.replyNote(this, score);
	}

	public String getName() {
		return this.name;
	}

	public int getPoint() {
		return point;
	}

	public void addPoint(int score) {
		this.point += score;
	}

	public void subPoint(int score) {
		this.point -= score;
	}
}