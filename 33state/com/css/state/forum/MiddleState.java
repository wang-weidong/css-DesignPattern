package com.css.state.forum;

/**
 * 中级用户状态实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class MiddleState extends AbstractState {

	public MiddleState(String stateName, int point) {
		super(stateName, point);
		this.discount = 2;
	}
}