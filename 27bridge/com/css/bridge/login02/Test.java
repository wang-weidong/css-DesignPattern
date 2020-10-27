package com.css.bridge.login02;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {

		AbstractLogin login;

		login = new WebLogin(new KeyAuth());
		login.login();

		login = new WebLogin(new FingerAuth());
		login.login();

		login = new MobileLogin(new FaceAuth());
		login.login();

		login = new MobileLogin(new FingerAuth());
		login.login();

	}
}
