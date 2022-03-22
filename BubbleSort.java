package com.java.practice;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] input)
	{
		int size = input.length;
		for(int i=1;i<size;i++)
		{
			for(int j=0;j<size-i;j++)
			{
				if(input[j+1] < input[j])
				{
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] input = new int[] {10,5,15,2,9,50,1};
		sort(input);
		System.out.println("Sorted array is : "+Arrays.toString(input));
	}

}
