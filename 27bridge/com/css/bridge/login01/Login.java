package com.css.bridge.login01;

/**
 * 用户登录实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Login {

	protected IAuthMode authMode;

	public Login(IAuthMode authMode) {
		this.authMode = authMode;
	}

	boolean login() {
		System.out.println("web用户登录");
		return authMode.checkAccount();
	}
}
