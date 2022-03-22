package com.java.practice;

import java.util.Arrays;

public class SelectionSort {

	public static void sort(Integer[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[j]<input[i])
				{
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] input = {10,5,15,2,9,50,1};
		sort(input);
		System.out.println("Sorted array is: " + Arrays.toString(input));
	}

}
