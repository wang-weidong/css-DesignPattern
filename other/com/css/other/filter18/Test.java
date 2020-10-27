package com.css.other.filter18;

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
		// 构建中介者
		Mediator mediator = new ForumMediator();
		// 构建具体的同事类
		AbstractUser user = new User();
		// 注册同事
		mediator.register(user);
		// 发送消息
		user.send(msg);
	}
}
