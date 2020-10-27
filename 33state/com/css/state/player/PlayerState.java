package com.css.state.player;

/**
 * 抽象状态类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class PlayerState {

	public void play(MediaPlayer player) {
		player.setVideoState(State.PLAY_STATE);
	}

	public void speed(MediaPlayer player) {
		player.setVideoState(State.SPEED_STATE);
	}

	public void pause(MediaPlayer player) {
		player.setVideoState(State.PAUSE_STATE);
	}

	public void stop(MediaPlayer player) {
		player.setVideoState(State.STOP_STATE);
	}
}
