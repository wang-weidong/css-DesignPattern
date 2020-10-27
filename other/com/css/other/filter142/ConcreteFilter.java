package com.css.other.filter142;

/**
 * 过滤器命令实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class ConcreteFilter extends Filter {

	@Override
	public String htmlFilter(String str) {
		return str.replace('<', '[').replace('>', ']');
	}

	@Override
	public String sensitiveFilter(String str) {
		return str.replace("敏感词1", "好词1").replace("敏感词2", "好词2").replace("王伟东", "Wang Weidong");
	}
}
