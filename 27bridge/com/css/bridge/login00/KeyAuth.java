package com.css.bridge.login00;

/**
 * key方式认证实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class KeyAuth {

	public boolean checkAccount() {
		System.out.print("Key方式: ");
		return User.getUser() == null;
	}
}
