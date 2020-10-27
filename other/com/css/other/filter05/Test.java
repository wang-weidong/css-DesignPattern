package com.css.other.filter05;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {
	public static void main(String[] args) {
		String msg = "大家好，<script>这些是敏感词1、敏感词2、<敏感词3>、王伟东</script>";

		Filter filter = new HTMLFilter();

		FilterChain chain = new FilterChain(filter);
		msg = chain.doFilter(msg);

		System.out.println(msg);
	}

}
