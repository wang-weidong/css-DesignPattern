package com.css.state.player;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		// 状态上下文
		MediaPlayer context = new MediaPlayer();
		// 状态
		context.play();
		context.printState();

		context.pause();
		context.printState();

		context.speed();
		context.printState();

		context.stop();
		context.printState();

		context.speed();
		context.printState();

		context.play();
		context.printState();
	}
}
