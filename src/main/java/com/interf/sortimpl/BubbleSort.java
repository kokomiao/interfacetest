package com.interf.sortimpl;

import com.interf.dao.ISort;

/**
 * 冒泡算法
 *
 */
public class BubbleSort implements ISort {


	public int[] sort(int[] values) {
		int temp;
		for (int i = 0; i < values.length; i++) {// 趟数
			for (int j = 0; j < values.length - i - 1; j++) {// 比较次数
				if (values[j] > values[j + 1]) {
					temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}
			}
		}
		return values;
	}
}
