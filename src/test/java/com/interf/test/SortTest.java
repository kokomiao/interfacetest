package com.interf.test;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.interf.dao.ISort;
import com.interf.sortimpl.BubbleSort;
import com.interf.sortimpl.ChooseSort;

/**
 * Unit test for simple App.
 */
public class SortTest extends TestCase {
	/**
	 * Bubble Test :-)
	 */
	public void testBubble() {
		ISort sort = new BubbleSort();
		int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5 };
		int[] newValues = sort.sort(values);
		int[] expectValues = { 0, 1, 2, 3, 4, 5, 6, 7, 9 };
		for (int i = 0; i < values.length; i++) {// 排序后打印数组中的元素
			Assert.assertEquals(expectValues[i], newValues[i]);
			System.out.print("Actual Index: " + i + "  value: " + values[i]);
			System.out.println(",Expect Index: " + i + "  value: " + values[i]);
		}
		System.out.println("===========================================================");
	}
	
	/**
	 * Choose Test :-)
	 */
	public void testChoose() {
		ISort sort = new ChooseSort();
		int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5 };
		int[] newValues = sort.sort(values);
		int[] expectValues = { 0, 1, 2, 3, 4, 5, 6, 7, 9 };
		for (int i = 0; i < values.length; i++) {// 排序后打印数组中的元素
			Assert.assertEquals(expectValues[i], newValues[i]);
			System.out.print("Actual Index: " + i + "  value: " + values[i]);
			System.out.println(",Expect Index: " + i + "  value: " + values[i]);
		}
		System.out.println("----------------------------------------------------------");
	}
}
