package com.css.prototype.email;

import java.util.Date;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Client {

	Email email;
	Email copy;

	public Client() {
		email = new Email("这是一个测试邮件。");
		email.getAttachment().setAttachTitle("这是一个附件。");
		email.addUser("张三");
		email.addUser("李四");
		email.setDate(new Date());
	}

	public Email getEmail() {
		return email;
	}

	public void setCopy(Email copy) {
		this.copy = copy;
	}

	public void updateCopy() {
		copy.setTitle("这是一个测试邮件的复制。");
		copy.setDate(new Date(0));
		copy.addUser("王五");
		copy.addUser("赵六");
		copy.getAttachment().setAttachTitle("这是一个附件的复制。");
	}

	public void printValue() {

		System.out.println(email.toString());
		System.out.println("----------------------------------");
		System.out.println(copy.toString());
		System.out.println("----------------------------------");
	}

	public static void main(String a[]) {
		System.out.println("----------------------------------");
		System.out.println("c1.getEmail().clone()");
		System.out.println("----------------------------------");

		Client c1 = new Client();
		c1.setCopy(c1.getEmail().clone());
		c1.printValue();
		c1.updateCopy();
		c1.printValue();

		System.out.println("c2.getEmail().deepClone()");
		System.out.println("----------------------------------");

		Client c2 = new Client();
		c2.setCopy(c2.getEmail().deepClone());
		c2.printValue();
		c2.updateCopy();
		c2.printValue();
	}

}