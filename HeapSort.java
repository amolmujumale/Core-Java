package com.java.practice;

import java.util.Arrays;

public class HeapSort {

	public void heapSort(int[] input) {
		System.out.println("Original array:"+Arrays.toString(input));
		for (int i = input.length / 2 - 1; i >= 0; i--) {
			heapify(input, i, input.length);
		}
		int size = input.length;
		System.out.println("after first iteration:"+Arrays.toString(input));
		for(int i=0;i<size;)
		{
			int temp = input[i];
			input[i] = input[size-1];
			input[size-1] = temp;
			heapify(input, 0, --size);
		}
		
		
	}

	public void heapify(int[] input, int current, int size) {
		int max = input[current];
		int elementTOSwap = 0;
		if (current * 2 + 1 < size && max < input[current * 2 + 1]) {
			max = input[current * 2 + 1];
			elementTOSwap = current * 2 + 1;
		}
		if (current * 2 + 2 < size && max < input[current * 2 + 2]) {
			max = input[current * 2 + 2];
			elementTOSwap = current * 2 + 2;
		}
		if (max != input[current]) {
			int temp = input[current];
			input[current] = input[elementTOSwap];
			input[elementTOSwap] = temp;
			heapify(input, elementTOSwap, size);
		}
	}

	public static void main(String[] args) {
		HeapSort obj = new HeapSort();
		int[] input = { 15, 9, 8, 16, 4, 11, 10, 20 };
		obj.heapSort(input);
		System.out.println(Arrays.toString(input));
	}

}
