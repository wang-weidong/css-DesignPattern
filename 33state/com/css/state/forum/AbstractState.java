package com.css.state.forum;

/**
 * 抽象状态类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class AbstractState {
	protected int levelPoint;
	protected String stateName;
	protected int discount = 1;

	public AbstractState(String stateName, int point) {
		this.stateName = stateName;
		this.levelPoint = point;
	}

	public void checkState(ForumAccount acc) {
		if (acc.getPoint() >= State.HIGH.levelPoint) {
			acc.setState(State.HIGH);
		} else if (acc.getPoint() >= State.MIDDLE.levelPoint) {
			acc.setState(State.MIDDLE);
		} else {
			acc.setState(State.PRIMARY);
		}
	}

	public void downloadFile(ForumAccount acc, int score) {
		acc.printInfo();
		int tmp = score / discount;
		if (acc.getPoint() < tmp)
			System.out.println("下载文件，需要" + score + (discount > 1 ? "/" + discount : "") + "积分，余额不足，文件下载失败！");
		else {
			System.out.println(acc.getName() + "下载文件，扣除" + score + (discount > 1 ? "/" + discount : "") + "积分。");
			acc.subPoint(tmp);
			checkState(acc);
		}
		acc.printInfo();
	}

	public void writeNote(ForumAccount acc, int score) {
		acc.printInfo();
		int tmp = score * discount;
		System.out.println(acc.getName() + "发布留言" + "，增加" + score + (discount > 1 ? "*" + discount : "") + "个积分。");
		acc.addPoint(tmp);
		checkState(acc);
		acc.printInfo();
	}

	public void replyNote(ForumAccount acc, int score) {
		acc.printInfo();
		System.out.println(acc.getName() + "回复留言，增加" + score + "积分。");
		acc.addPoint(score);
		checkState(acc);
		acc.printInfo();
	}
}