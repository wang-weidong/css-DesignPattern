package com.css.bridge.login02;

/**
 * 用户中心登录，身份认证抽象类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public abstract class AbstractLogin {

	protected IAuthMode authMode;

	public AbstractLogin(IAuthMode authMode) {
		this.authMode = authMode;
	}

	public abstract boolean login();
}
