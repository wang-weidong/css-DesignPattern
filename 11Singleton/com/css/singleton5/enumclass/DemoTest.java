package com.css.singleton5.enumclass;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class DemoTest {

	public static void main(String[] args) {
		List<Thread> threads = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			threads.add(new Thread(() -> {

				DemoSingleton singleton = DemoSingleton.getInstance();
				System.out.println(Thread.currentThread().getName() + " " + singleton.getConfig());
			}));
		}
		threads.forEach(Thread::start);
		System.out.println("---");
	}
}
