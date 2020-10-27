package com.css.state.player;

/**
 * 停止状态实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class StopState extends PlayerState {

	public void speed(MediaPlayer player) {
		System.out.println("ERROR 停止状态不能快进！！！");
	}

	public void pause(MediaPlayer player) {
		System.out.println("ERROR 停止状态不能暂停！！！");
	}

	public void stop(MediaPlayer player) {
		System.out.println("停止播放视频。");
	}
}
