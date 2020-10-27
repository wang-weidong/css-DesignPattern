package com.css.strategy.sort;

/**
 * 插入排序
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class InsertionSort implements Sort {
	public int[] sort(int arr[]) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			int j;
			int temp = arr[i];
			for (j = i; j > 0; j--) {
				if (arr[j - 1] > temp) {
					arr[j] = arr[j - 1];

				} else
					break;
			}
			arr[j] = temp;
		}
		System.out.println("插入排序");
		return arr;
	}
}