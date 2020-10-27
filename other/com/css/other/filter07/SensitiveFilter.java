package com.css.other.filter07;

/**
 * Sensitive过滤器子构件实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		return str.replace("敏感词1", "好词1").replace("敏感词2", "好词2").replace("王伟东", "Wang Weidong");
	}

	@Override
	public void addFilter(Filter filter) {
		throw new UnsupportedOperationException("不支持添加操作");
	}
}
