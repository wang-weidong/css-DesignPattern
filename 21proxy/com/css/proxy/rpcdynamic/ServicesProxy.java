package com.css.proxy.rpcdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ServicesProxy implements InvocationHandler {
	private Object delegate;

	public Object bind(Object delegate) {
		this.delegate = delegate;
		return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(),
				this.delegate.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		try {
			System.out.println(method.getName() + "开始执行...");
			result = method.invoke(this.delegate, args);
			System.out.println(method.getName() + "执行结束...");
			System.out.println("----------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}