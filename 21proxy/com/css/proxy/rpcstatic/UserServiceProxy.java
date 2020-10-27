package com.css.proxy.rpcstatic;

import com.css.proxy.rpc.user.UserService;

/**
 * 用户服务静态代理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class UserServiceProxy implements UserService {

	private UserService userService;

	public UserServiceProxy(UserService subject) {
		this.userService = subject;
	}

	@Override
	public void getUserInfo() {
		System.out.println("getUserInfo开始执行...");
		userService.getUserInfo();
		System.out.println("getUserInfo执行结束...");
		System.out.println("----------------------------------");
	}

	@Override
	public void getUserBaseInfo() {
		System.out.println("getUserBaseInfo开始执行...");
		userService.getUserBaseInfo();
		System.out.println("getUserBaseInfo执行结束...");
		System.out.println("----------------------------------");
	}

}
