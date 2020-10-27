package com.css.interpreter.calculator;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Client {
	public static void main(String args[]) {
		String statement = "3 * 2 * 4 / 6 % 5";

		Calculator calculator = new Calculator();

		calculator.build(statement);

		int result = calculator.compute();

		System.out.println(statement + " = " + result);
	}
}