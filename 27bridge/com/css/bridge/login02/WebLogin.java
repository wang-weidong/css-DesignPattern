package com.css.bridge.login02;

/**
 * Web系统登录实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class WebLogin extends AbstractLogin {

	public WebLogin(IAuthMode authMode) {
		super(authMode);
	}

	@Override
	public boolean login() {
		System.out.println("Web系统登录");
		return authMode.checkAccount();
	}
}
