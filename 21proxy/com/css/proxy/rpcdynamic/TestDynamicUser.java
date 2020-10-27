package com.css.proxy.rpcdynamic;

import com.css.proxy.rpc.org.HessionOrgService;
import com.css.proxy.rpc.org.OrgService;
import com.css.proxy.rpc.org.WebServiceOrgService;
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
public class TestDynamicUser {

	public static void main(String[] args) {
		// 动态代理
		UserService proxy = (UserService) new ServicesProxy().bind(new HessionUserService());
		proxy.getUserBaseInfo();
		proxy.getUserInfo();

		proxy = (UserService) new ServicesProxy().bind(new WebServiceUserService());
		proxy.getUserBaseInfo();
		proxy.getUserInfo();

		OrgService orgProxy = (OrgService) new ServicesProxy().bind(new HessionOrgService());
		orgProxy.getOrgBaseInfo();
		orgProxy.getOrgInfo();

		orgProxy = (OrgService) new ServicesProxy().bind(new WebServiceOrgService());
		orgProxy.getOrgBaseInfo();
		orgProxy.getOrgInfo();

	}
}
