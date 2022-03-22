package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

public class ArrayPractice {

	public static void main(String[] args) {

		// 1d to list

		String[] s = new String[] { "hi amol", "hi rashmi" };
		String s2 = "Hi How are you";
		String s3 = s2.substring(2, 5);
		System.out.println("substring is: "+s3);
		List<String> ls = Arrays.asList(s);
		System.out.println(ls.get(0));

		int[] a = { 1, 2, 3, 4 };
		int[] b = new int[] { 1, 2, 3, 4 };
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3));
		Integer[] e = l1.toArray(new Integer[l1.size()]);
		l1.add(4);
		System.out.println(l1);
		int[] d = l1.stream().mapToInt(i -> i.intValue()).toArray();
		Integer[] c = l1.toArray(new Integer[l1.size()]);
		List<List<Integer>> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();

		Integer x = 5;
		int y = x;
		Integer z = y;

		l3.add(1);
		l3.add(2);
		l2.add(l3);
		l3 = new ArrayList<>();
		l3.add(4);
		l3.add(5);
		l2.add(l3);

		l3.forEach(System.out::println);
		Integer[][] intArr = new Integer[l2.size()][];
		int k = 0;
		for (List<Integer> l : l2) {
			intArr[k++] = l.toArray(new Integer[l.size()]);
		}
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr.length; j++) {
				System.out.println(intArr[i][j]);
			}
		}

		for (Integer[] row : intArr) {
			System.out.println(Arrays.toString(row));
		}
		Stack<Integer> stack = new Stack<>();

		stack.push(1);
		stack.push(2);
		while (!stack.isEmpty())
			System.out.println(stack.pop());

		int[] sample = new int[] { 1, 2, 3, 4 };
		int[] sample2=Arrays.copyOfRange(sample, 2, 4);
		System.out.println("copied array is"+Arrays.toString(sample2));
		
		Integer[] aaa = new Integer[] {1,2,3,4,5};
		List<Integer> lll = Arrays.asList(aaa);
		Integer[] bbb = lll.toArray(new Integer[lll.size()]);
		int[] ccc = lll.stream().mapToInt(Integer::intValue).toArray();
		List<Integer> mmm = Arrays.stream(ccc).boxed().collect(Collectors.toList());
		
		Arrays.stream(ccc).boxed().collect(Collectors.toList());
		List<int []> m4 = new ArrayList<>();
		
		int[][] ddd = {{9,2},{5,6},{1,3}};
		
		Queue<int[]> qq = new PriorityQueue<>((abcd,bcda)->abcd[0]-bcda[0]);
		qq.add(new int[] {9, 2});
		qq.add(new int[] {5,6});
		qq.add(new int[] {1,3});
		
		System.out.println("priority queue output");
		while(!qq.isEmpty())
			System.out.println(Arrays.toString(qq.poll()));
		
		
		for(int i=0;i<ddd.length-1;i++)
		{
			for(int j=i+1;j<ddd.length;j++)
			{
				if(ddd[j][0]<ddd[i][0])
				{
					int temp[] = ddd[j];
					ddd[j] = ddd[i];
					ddd[i] = temp;
				}
			}
		}
		for(int[] temp:ddd)
		{
		//	System.out.println(Arrays.toString(temp));
		}
		
		
	}
}