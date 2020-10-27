package com.css.proxy.rpc.org;

/**
 * 被代理的机构接口类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public interface OrgService {

	/**
	 * 定义方法，由具体实现类去实现该方法
	 */
	public void getOrgBaseInfo();

	public void getOrgInfo();

}
