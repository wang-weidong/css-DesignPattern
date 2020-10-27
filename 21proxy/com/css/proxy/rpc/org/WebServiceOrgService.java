package com.css.proxy.rpc.org;

/**
 * 机构WebService接口具体实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class WebServiceOrgService implements OrgService {
	@Override
	public void getOrgInfo() {
		System.out.println("WebServiceOrgService具体实现: getOrgInfo");
	}

	@Override
	public void getOrgBaseInfo() {
		System.out.println("WebServiceOrgService具体实现: getOrgBaseInfo");
	}
}
