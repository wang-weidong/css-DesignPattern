package com.css.visitor.course;

import java.util.Random;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Client {
	private Element root = new CourseCatalog("课程目录");
	IVisitor visitor;

	public Client() {
		this.initStructure();
	}

	public void initStructure() {
		String[] courses = { "Java课程", "Python课程", "Go课程" };
		Element[] catalogs = new Element[courses.length];
		for (int i = 0; i < courses.length; i++) {
			catalogs[i] = new CourseCatalog(courses[i] + "目录");
			root.add(catalogs[i]);
			int bookNum = new Random().nextInt(5) + 1;

			for (int j = 0; j < bookNum; j++) {
				int price = new Random().nextInt(100) + 1;
				catalogs[i].add(new Course(courses[i] + (j + 1), price));
			}
		}

		Element catalog1 = new CourseCatalog("目录一级");
		root.add(catalog1);

		Element catalog2 = new CourseCatalog("目录二级");
		catalog1.add(catalog2);

		Element catalog3 = new CourseCatalog("目录三级");
		catalog2.add(catalog3);

		catalog3.add(new Course("目录三级课程", 50));
	}

	public void accept(IVisitor visitor) {
		root.accept(visitor);
	}

	public static void main(String[] args) {
		IVisitor visitor1 = new Visitor1();
		IVisitor visitor2 = new Visitor2();

		Client client = new Client();
		client.accept(visitor1);
		client.accept(visitor2);
	}

}
