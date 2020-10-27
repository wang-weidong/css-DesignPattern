package com.css.state.player;

/**
 * 暂停状态实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class PauseState extends PlayerState {

	public void pause(MediaPlayer player) {
		System.out.println("暂停播放视频");
	}
}
