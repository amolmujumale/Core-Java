package com.java.practice;

import java.util.Arrays;

public class InsertionSort {

	public static void sort(int[] a) {
		int size = a.length;
		for (int i = 1; i < size; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				} else
					break;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 5, 15, 2, 9, 50, 1 };
		sort(a);
		System.out.println("Sorted array is : "+Arrays.toString(a));
	}

}
