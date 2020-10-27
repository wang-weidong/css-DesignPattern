package com.css.bridge.login00;

/**
 * 用户登录实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Login {

	protected KeyAuth authMode;

	public Login(KeyAuth authMode) {
		this.authMode = authMode;
	}

	boolean login() {
		System.out.println("用户登录");
		return authMode.checkAccount();
	}
}
