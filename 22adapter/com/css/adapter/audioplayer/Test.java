package com.css.adapter.audioplayer;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "song1.mp3");
		audioPlayer.play("mp4", "song2.mp4");
		audioPlayer.play("avi", "song3.avi");
	}
}