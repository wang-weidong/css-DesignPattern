package com.css.state.player;

/**
 * 状态工厂类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class State {
	// 播放
	public final static PlayState PLAY_STATE = new PlayState();

	// 停止
	public final static StopState STOP_STATE = new StopState();

	// 快进
	public final static SpeedState SPEED_STATE = new SpeedState();

	// 暂停
	public final static PauseState PAUSE_STATE = new PauseState();

}
