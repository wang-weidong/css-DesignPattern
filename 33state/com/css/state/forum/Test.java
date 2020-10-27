package com.css.state.forum;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {
	public static void main(String args[]) {
		ForumAccount account = new ForumAccount("张三");
		account.writeNote(20);
		System.out.println("--------------------------------------");
		account.downloadFile(20);
		System.out.println("--------------------------------------");
		account.replyNote(100);
		System.out.println("--------------------------------------");
		account.writeNote(40);
		System.out.println("--------------------------------------");
		account.downloadFile(80);
		System.out.println("--------------------------------------");
		account.downloadFile(322);
		System.out.println("--------------------------------------");
		account.writeNote(1000);
		System.out.println("--------------------------------------");
		account.downloadFile(80);
		System.out.println("--------------------------------------");
	}
}