package com.css.proxy.rpc.user;

/**
 * 用户Hession接口具体实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class HessionUserService implements UserService {
	@Override
	public void getUserInfo() {
		System.out.println("HessionUserService具体实现: getUserInfo");
	}

	@Override
	public void getUserBaseInfo() {
		System.out.println("HessionUserService具体实现: getUserBaseInfo");
	}
}
