package com.css.other.filter161;

/**
 * Sensitive过滤处理实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class SensitiveFilter extends Filter {

	@Override
	public String doFilter(String str) {
		str = str.replace("敏感词1", "好词1").replace("敏感词2", "好词2").replace("王伟东", "Wang Weidong");
		return super.doNext(str);
	}
}
