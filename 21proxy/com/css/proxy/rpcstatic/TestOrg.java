package com.css.proxy.rpcstatic;

import com.css.proxy.rpc.org.HessionOrgService;
import com.css.proxy.rpc.org.OrgService;
import com.css.proxy.rpc.org.WebServiceOrgService;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class TestOrg {

	public static void main(String[] args) {

		OrgService proxy = new OrgServiceProxy(new HessionOrgService());
		proxy.getOrgBaseInfo();
		proxy.getOrgInfo();

		proxy = new OrgServiceProxy(new WebServiceOrgService());
		proxy.getOrgBaseInfo();
		proxy.getOrgInfo();

	}
}
