package com.css.bridge.login02;

/**
 * 认证方式接口类， 桥定义实现接口
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public interface IAuthMode {
	/**
	 * 账号校验接口
	 */
	public boolean checkAccount();
}
