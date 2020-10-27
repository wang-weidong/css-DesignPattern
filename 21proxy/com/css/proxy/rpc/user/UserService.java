package com.css.proxy.rpc.user;

/**
 * 被代理的用户接口类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public interface UserService {

	/**
	 * 定义方法，由具体实现类去实现该方法
	 */
	public void getUserBaseInfo();

	public void getUserInfo();

}
