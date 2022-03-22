package com.java.practice;

import java.util.Arrays;

public class QuickSort {

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (a[j] < pivot) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i + 1, high);
		return i + 1;
	}

	public static void sort(int[] a, int low, int high) {
		if (low < high) {
			int pi = partition(a, low, high);
			sort(a, low, pi - 1);
			sort(a, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 5, 15, 2, 9, 50, 1 };
		sort(a, 0, a.length - 1);
		System.out.println("Sorted array is : " + Arrays.toString(a));
	}

}
