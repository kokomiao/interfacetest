package com.interf.sortimpl;

import com.interf.dao.ISort;

public class ChooseSort implements ISort {
	/**
	 * 选择排序
	 *
	 * @paramsrc待排序的数组
	 */
	public int[] sort(int[] src) {
		int len = src.length;
		int temp;
		for (int i = 0; i < len; i++) {
			temp = src[i];
			int j;
			int samllestLocation = i;// 最小数的下标
			for (j = i + 1; j < len; j++) {
				if (src[j] < temp) {
					temp = src[j];// 取出最小值
					samllestLocation = j;// 取出最小值所在下标
				}
			}
			src[samllestLocation] = src[i];
			src[i] = temp;
		}
		return src;
	}

}
