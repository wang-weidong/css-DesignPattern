package com.css.other.filter00;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test2 {
	public static void main(String[] args) {
		String msg = "大家好，<script>这些是敏感词1、敏感词2、<敏感词3>、王伟东</script>";

		msg = htmlFilter(msg);

		msg = sensitiveFilter(msg);

		System.out.println(msg);
	}

	public static String htmlFilter(String str) {
		return str.replace('<', '[').replace('>', ']');
	}

	public static String sensitiveFilter(String str) {
		return str.replace("敏感词1", "好词1").replace("敏感词2", "好词2").replace("王伟东", "Wang Weidong");
	}

}
