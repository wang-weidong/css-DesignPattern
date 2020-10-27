package com.css.adapter.audioplayer;

/**
 * Mp3播放器-Adapter（适配器类）
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Mp3Adapter extends Mp3Player implements Player {

	@Override
	public void play(String audioType, String fileName) {
		System.out.print(audioType + ": ");
		super.playMp3(fileName);
	}
}