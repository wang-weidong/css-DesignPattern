package com.css.bridge.base;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		// 创建具体实现类
		Implementor impl = new ConcreteImplementorA();
		// 创建扩充抽象类，并桥接关联 impl对象
		Abstraction abstraction = new RefinedAbstraction(impl);
		// 执行操作，通常由具体实现类完成
		abstraction.operation();

		Abstraction abstraction2 = new RefinedAbstraction(new ConcreteImplementorB());
		abstraction2.operation();
	}
}
