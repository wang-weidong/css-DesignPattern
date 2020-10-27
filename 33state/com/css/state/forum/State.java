package com.css.state.forum;

/**
 * 状态工厂类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class State {
	public final static PrimaryState PRIMARY = new PrimaryState("初级", 0);
	public final static MiddleState MIDDLE = new MiddleState("中级", 100);
	public final static HighState HIGH = new HighState("高级", 1000);
}
