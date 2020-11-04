package com.css.other.filter142;

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

		// 创建执行者
		Invoker invoker = new Invoker();
		// 创建命令
		Filter f1 = new ConcreteFilter();
		// 添加命令，执行命令
		invoker.setFilter(f1);
		msg = invoker.execute(msg);

		System.out.println(msg);
	}
}
