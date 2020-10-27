package com.css.state.player;

/**
 * 播放器类--Context上下文类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class MediaPlayer {
	private PlayerState playerState = State.STOP_STATE;

	public void setVideoState(PlayerState videoState) {
		this.playerState = videoState;
	}

	public void play() {
		this.playerState.play(this);
	}

	public void speed() {
		this.playerState.speed(this);
	}

	public void pause() {
		this.playerState.pause(this);
	}

	public void stop() {
		this.playerState.stop(this);
	}

	public void printState() {
		System.out.println("当前状态：" + this.playerState.getClass().getSimpleName());
	}
}
