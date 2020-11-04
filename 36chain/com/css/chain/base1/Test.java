package com.css.chain.base1;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {
	public static void main(String[] args) {
		// 创建流水线
		Pipeline pipeline = new Pipeline();
		// 设置链中的阶段顺序,1-->2-->3
		pipeline.add(new ConcreteHandler1());
		pipeline.add(new ConcreteHandler2());
		pipeline.add(new ConcreteHandler3());
		// 提交请求，返回结果
		pipeline.handle("这是一个请求1", 1);
		pipeline.handle("这是一个请求2", 2);
	}
}
