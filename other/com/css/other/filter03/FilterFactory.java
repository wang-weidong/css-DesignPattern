package com.css.other.filter03;

/**
 * 过滤器抽象工厂类具体实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class FilterFactory extends Factory {

	@Override
	public Filter getHTMLFilter() {
		return new HTMLFilter();
	}

	@Override
	public Filter getSensitiveFilter() {
		return new SensitiveFilter();
	}

}
