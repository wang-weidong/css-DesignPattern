package com.css.state.forum;

/**
 * 高级用户状态实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class HighState extends AbstractState {

	public HighState(String stateName, int point) {
		super(stateName, point);
		this.discount = 3;
	}

}