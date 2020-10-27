package com.css.bridge.base;

/**
 * 修正/扩充抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void operation() {
		System.out.println("操作");
		implementor.operationImpl();
	}
}
