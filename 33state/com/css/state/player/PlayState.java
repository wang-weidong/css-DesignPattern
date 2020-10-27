package com.css.state.player;

/**
 * 播放状态实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class PlayState extends PlayerState {

	public void play(MediaPlayer player) {
		System.out.println("正常播放视频的状态");
	}
}
