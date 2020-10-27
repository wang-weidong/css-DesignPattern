package com.css.state.player;

/**
 * 加速状态实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class SpeedState extends PlayerState {

	public void speed(MediaPlayer player) {
		System.out.println("快进播放视频");
	}

}
