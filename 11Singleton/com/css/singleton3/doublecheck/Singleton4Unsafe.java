package com.css.singleton3.doublecheck;

/**
 * <pre>
 * 双重检验 不安全 主要在于 instance = new Singleton() 这句，这并非是一个原子操作: 
 * 1. 给 instance 分配内存 
 * 2. 调用  Singleton 构造函数来初始化成员变量 
 * 3. 将 instance 对象指向分配的内存空间
 * 但是在JVM即时编译器中存在指令重排序的优化。 最终的执行顺序可能是 1-2-3 也可能是 1-3-2
 * 多线程时 instance 已经是非 null 了（但却没有初始化）
 * </pre>
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Singleton4Unsafe {
	private static Singleton4Unsafe instance;

	public static Singleton4Unsafe getInstance() {
		if (instance == null) {
			synchronized (Singleton4Unsafe.class) {
				if (instance == null) {
					instance = new Singleton4Unsafe();
				}
			}
		}
		return instance;
	}

}