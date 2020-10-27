package com.css.other.filter06;

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

		Filter f = new Filter();
		f = new HTMLFilter(f);
		f = new SensitiveFilter(f);

		msg = f.doFilter(msg);

		System.out.println(msg);
	}

}
