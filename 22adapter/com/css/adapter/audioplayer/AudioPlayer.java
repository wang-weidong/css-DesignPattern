package com.css.adapter.audioplayer;

/**
 * 播放器代理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class AudioPlayer implements Player {
	Player player;

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("mp3")) {

			player = new Mp3Adapter();
			player.play(audioType, fileName);

		} else if (audioType.equalsIgnoreCase("mp4")) {

			player = new Mp4Adapter();
			player.play(audioType, fileName);

		} else {

			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}
}