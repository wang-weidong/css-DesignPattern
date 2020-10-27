package com.css.proxy.rpcstatic;

import com.css.proxy.rpc.user.HessionUserService;
import com.css.proxy.rpc.user.UserService;
import com.css.proxy.rpc.user.WebServiceUserService;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class TestUser {

	public static void main(String[] args) {

		UserService proxy = new UserServiceProxy(new HessionUserService());
		proxy.getUserBaseInfo();
		proxy.getUserInfo();

		proxy = new UserServiceProxy(new WebServiceUserService());
		proxy.getUserBaseInfo();
		proxy.getUserInfo();

	}
}
