package com.java.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SetSum {

//initially the currentElement is the list size...
	public static boolean isSumFound(List<Integer> l, int currentElement, int sum) {
//if sum is zero means the number is found..
		if (sum == 0)
			return true;
//the sum is not found and the end of the list is reached		
		if (currentElement == 0)
			return false;
		
		if(sum>l.get(currentElement - 1))
			isSumFound(l, currentElement - 1, sum);
			

//check if the sum can be obtained using the current element or the difference between sum & current element
		return (isSumFound(l, currentElement - 1, sum)
				|| isSumFound(l, currentElement - 1, sum - l.get(currentElement - 1)));
	}

	/*
	 * //initially the currentElement is 0 public static boolean
	 * isSumFound(List<Integer> l, int currentElement, int sum) { //if sum is zero
	 * means the number is found.. if (sum == 0) return true; //the sum is not found
	 * and the end of the list is reached if (currentElement == l.size()-1) return
	 * false;
	 * 
	 * //check if the sum can be obtained using the current element or the
	 * difference between sum & current element return (isSumFound(l, currentElement
	 * + 1, sum) || isSumFound(l, currentElement + 1, sum - l.get(currentElement +
	 * 1))); }
	 */

	public static void main(String[] args) {
		int input[] = { 1, 2, 9, 5};
		int sum = 18;
		int n = input.length;
		List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 9, 5));

		if (isSumFound(list, n, sum) == true)
			System.out.println("sum found");
		else
			System.out.println("sum not found");
	}

}
