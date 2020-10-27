package com.css.adapter.audioplayer;

/**
 * Mp3播放器-Adaptee（适配者类）
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Mp3Player {

	public void playMp3(String fileName) {
		System.out.println("Playing " + fileName);
	}
}