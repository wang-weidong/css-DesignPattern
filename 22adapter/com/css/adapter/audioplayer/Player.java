package com.css.adapter.audioplayer;

/**
 * 播放器目标抽象类-Target（目标抽象类）
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public interface Player {
	public void play(String audioType, String fileName);
}