package com.css.observer.message;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class Test {

	public static void main(String[] args) {
		Subject course = new Subject("Java设计模式");

		JavaTeacher teacher1 = new JavaTeacher("张三");
		JavaTeacher teacher2 = new JavaTeacher("李四");
		JavaDirector director = new JavaDirector("王五");

		course.addObserver(teacher1);
		course.addObserver(teacher2);
		course.addObserver(director);

		// 业务逻辑代码
		Question question = new Question("学生A", "Java的函数如何编写？");

		course.produceQuestion(question);

	}
}
