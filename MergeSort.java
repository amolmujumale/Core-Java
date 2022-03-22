package com.java.practice;

import java.util.Arrays;

public class MergeSort {

	public static void sort(int[] a, int mid, int left, int right) {
		int l1 = mid - left + 1;
		int l2 = right - mid;
		int[] array1 = new int[l1];
		int[] array2 = new int[l2];

		for (int i = 0; i < l1; i++) {
			array1[i] = a[left + i];
		}
		for (int j = 0; j < l2; j++) {
			array2[j] = a[mid + j + 1];
		}
		int i = 0, j = 0, k = left;
		// int[] array3 = new int[l1 + l2];
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) {
				a[k++] = array1[i];
				i++;
			} else if (array2[j] < array1[i]) {
				a[k++] = array2[j];
				j++;
			}
		}
		while (i < array1.length)
			a[k++] = array1[i++];
		while (j < array2.length)
			a[k++] = array2[j++];
	}
	

	public static void divide(int[] a, int left, int right) {
		if (left < right) {
			int mid = (left+right) / 2;
			divide(a, left, mid);
			divide(a, mid + 1, right);
			sort(a, mid, left, right);
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 5, 15, 2, 9, 50, 1 };
		divide(a, 0, a.length - 1);
		System.out.println("sortedb array is : " + Arrays.toString(a));

	}

}
