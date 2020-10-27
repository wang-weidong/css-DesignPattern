package com.css.singleton.test;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

import com.css.singleton5.enumclass.Singleton6;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) throws Exception {
//		Object singleton = Singleton6.getInstance();
//		serializaTest(singleton);
//		constructorTest(singleton);
//		threadTest();
		for (int i = 0; i < 5; i++)
			testPerformence(i);
	}

	public static void threadTest() {
		IntStream.rangeClosed(1, 10).forEach(i -> new Thread() {
			public void run() {
				Object singleton = Singleton6.getInstance();
				System.out.println(Thread.currentThread().getName() + " " + singleton);

			}
		}.start());
	}

	public static void testPerformence(int index) throws Exception {
		final int threadNum = 10000;
		final int number = 1000000000;
		CountDownLatch connectedSemaphore = new CountDownLatch(threadNum);
		long start = System.currentTimeMillis();

		IntStream.rangeClosed(1, threadNum).forEach(i -> new Thread() {
			public void run() {
				for (int j = 0; j < number; j++) {
					Singleton6.getInstance();
				}
				connectedSemaphore.countDown();
			}
		}.start());
		connectedSemaphore.await();
		long end = System.currentTimeMillis();
		System.out.println("第" + index + "次，总耗时: " + (end - start) + " ms.");
	}

	public static void constructorTest(Object instance) {
		try {
			System.out.println(instance);
			Constructor<? extends Object> constructor;
			constructor = instance.getClass().getDeclaredConstructor();
			constructor.setAccessible(true);
			Object newInstance = constructor.newInstance();
			System.out.println(newInstance);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void serializaTest(Object instance) {
		System.out.println(instance);
		byte[] serialize = SerializaJava.serialize(instance);
		Object newInstance = SerializaJava.deserialize(serialize);
		System.out.println(newInstance);
	}

}
