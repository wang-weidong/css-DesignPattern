package com.css.other.filter19;

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
		// 初始化元素
		Element element = new Element(msg);
		Visitor visior1 = new ConcreteVisitor1();
		Visitor visior2 = new ConcreteVisitor2();

		// 回调注入
		element.accept(visior1);

		element.accept(visior2);
	}

}
