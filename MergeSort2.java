package com.java.practice;

import java.util.Arrays;

public class MergeSort2 {

	public static void merge(int[] a, int mid, int start, int end) {
		int l1 = mid - start + 1;
		int l2 = end - mid;
		int[] a1 = new int[l1];
		int[] a2 = new int[l2];
		for (int i = 0; i < l1; i++) {
			a1[i] = a[start + i];
		}
		for (int j = 0; j < l2; j++) {
			a2[j] = a[mid + j + 1];
		}
		int m = 0, n = 0, p = start;
		while (m < l1 && n < l2) {
			if (a1[m] < a2[n]) {
				a[p++] = a1[m++];
			} else if (a1[m] > a2[n]) {
				a[p++] = a2[n++];
			}
		}
		while (m < l1)
			a[p++] = a1[m++];
		while (n < l2)
			a[p++] = a2[n++];

	}

	public static void mergeSort(int[] a, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			merge(a, mid, start, end);

		}
	}

	public static void main(String[] args) {
		int[] input = { 12, 15, 8, 1, 90, 57, 4 };
		mergeSort(input, 0, input.length - 1);
		System.out.println("sorted array is:" + Arrays.toString(input));

	}

}
