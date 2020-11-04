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

		account.downloadFile(20);
		
		account.replyNote(100);
		
		account.writeNote(40);

		account.downloadFile(80);

		account.downloadFile(322);

		account.writeNote(1000);

		account.downloadFile(80);
	}
}