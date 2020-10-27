package com.css.bridge.login01;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {
	public static void main(String[] args) {
		Login login;

		login = new Login(new KeyAuth());
		login.login();

		login = new Login(new FingerAuth());
		login.login();

		login = new Login(new FaceAuth());
		login.login();
	}
}
