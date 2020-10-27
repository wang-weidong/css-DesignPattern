package com.css.bridge.login01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 辅助用户服务类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class User {
	private static Random random = new Random();
	private static List<String> users = new ArrayList<>();
	static {
		users.add("张三");
		users.add("李四");
		users.add("王五");
	}

	public static String getUser() {
		int index = random.nextInt(users.size() * 2);
		String user = index >= users.size() ? null : users.get(index);
		System.out.println(user == null ? "账号校验不通过！" : "账号校验通过，登录用戶：" + user);
		System.out.println("-------------------------------");
		return user;
	}
}
