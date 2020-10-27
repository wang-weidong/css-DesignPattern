package com.css.strategy.sort;

/**
 * 数组排序处理类-环境类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * CSS. WangWeidong
 */
public class ArrayHandler {
	private Sort sortObj;

	public ArrayHandler(Sort sortObj) {
		this.sortObj = sortObj;
	}

	public int[] sort(int arr[]) {
		sortObj.sort(arr);
		return arr;
	}
}