package com.css.other.filter02;

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

		Filter f1 = FilterFactory.getFilter(HTMLFilter.class);

		Filter f2 = FilterFactory.getFilter(SensitiveFilter.class);

		msg = f1.doFilter(msg);
		msg = f2.doFilter(msg);

		System.out.println(msg);
	}

}
