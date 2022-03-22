package com.java.practice;

public class BinarySearch {

	public static int binarySearch(int[] a, int n)
	{
		int left = 0;
		int right=a.length-1, mid=0;
		while(left<=right)
		{
			mid = (left+right)/2;
			if(a[mid]==n)
				return mid;
			else if(n<a[mid])
				right=mid-1;
				else
					left=mid+1;
		}
		
		return -1;
	}
	
	public static int binarySearch2(int[] a, int n, int start, int end)
	{
		if(end<start)
			return -1;
		
			int mid = (start + end)/2;
			if(a[mid]==n)
				return mid;
			else if(n<a[mid])
			return	 binarySearch2(a, n, start, mid-1);
			else 
			return	 binarySearch2(a, n, mid+1, end);
		
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 5, 8, 9, 50, 51, 57, 99 };
		System.out.println("elements position is: "+binarySearch(a, 57));
		System.out.println("elements position is: "+binarySearch2(a, 57, 0, a.length-1));
	}

}
