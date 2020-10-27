package com.css.proxy.rpcstatic;

import com.css.proxy.rpc.org.OrgService;

/**
 * 机构服务静态代理类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class OrgServiceProxy implements OrgService {

	private OrgService orgService;

	public OrgServiceProxy(OrgService service) {
		this.orgService = service;
	}

	@Override
	public void getOrgInfo() {
		System.out.println("getOrgInfo开始执行...");
		orgService.getOrgInfo();
		System.out.println("getOrgInfo执行结束...");
		System.out.println("----------------------------------");
	}

	@Override
	public void getOrgBaseInfo() {
		System.out.println("getOrgBaseInfo开始执行...");
		orgService.getOrgBaseInfo();
		System.out.println("getOrgBaseInfo执行结束...");
		System.out.println("----------------------------------");
	}

}
