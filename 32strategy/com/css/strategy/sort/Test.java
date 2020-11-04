package com.css.strategy.sort;

import java.util.Arrays;

/**
 * 测试
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class Test {
	public static void main(String args[]) {
		int arr[] = { 1, 4, 6, 2, 5, 3, 7, 10, 9 };
		
		Sort sort=new BubbleSort();

		ArrayHandler ah = new ArrayHandler(sort);// 设置具体策略

		int result[] = ah.sort(arr);

		System.out.println(Arrays.toString(result));
	}
}