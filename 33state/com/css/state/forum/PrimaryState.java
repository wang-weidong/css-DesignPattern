package com.css.state.forum;

/**
 * 初级用户状态实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class PrimaryState extends AbstractState {

	public PrimaryState(String stateName, int point) {
		super(stateName, point);
		this.discount = 1;
	}

	public void downloadFile(ForumAccount acc, int score) {
		System.out.println("对不起，" + acc.getName() + "，您没有下载文件的权限！");
	}

}