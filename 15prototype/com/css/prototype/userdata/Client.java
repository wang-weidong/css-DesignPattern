package com.css.prototype.userdata;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Client {
	UserData data = new UserData();
	UserData copy;

	public Client() {
		data.setValue("张三");
		data.setValue("李四");
	}

	public UserData getData() {
		return data;
	}

	public void setCopy(UserData copy) {
		this.copy = copy;
	}

	public void test() {
		copy.setValue("王五");
		copy.setValue("赵六");

		System.out.println(data.getValue());
		System.out.println(copy.getValue());
	}

	public static void main(String[] args) {
		System.out.println("----------------------------------");
		System.out.println("c1.getData().clone()");

		Client c1 = new Client();
		c1.setCopy(c1.getData().clone());
		c1.test();

		System.out.println("----------------------------------");
		System.out.println("c2.getData().deepClone()");

		Client c2 = new Client();
		c2.setCopy(c2.getData().deepClone1());
		c2.test();

		System.out.println("----------------------------------");
		System.out.println("c3.getData().deepClone2()");

		Client c3 = new Client();
		c3.setCopy(c3.getData().deepClone2());
		c3.test();

	}

}
