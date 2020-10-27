package com.css.bridge.login02;

/**
 * 手机应用登录实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class MobileLogin extends AbstractLogin {

	public MobileLogin(IAuthMode authMode) {
		super(authMode);
	}

	@Override
	public boolean login() {
		System.out.println("手机应用登录");
		return authMode.checkAccount();
	}
}
