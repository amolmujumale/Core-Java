package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

public class InterviewQuestion {

	public static void sort(List<Integer> l) {

		int abcde[] = l.stream().mapToInt(i->i.intValue()).toArray();		
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Integer[] lta = list.toArray(new Integer[list.size()]); 
		List<List<Integer>> list2 = new ArrayList<>();
		int[][] d2 = {{1,2,3},{4,5,6}};
		List<int[]> list23 = new ArrayList<>();
		for(int[] temp:d2)
		{
			list23.add(temp);
		}
		int[][] abcd = list23.toArray(new int[list23.size()][]);
	//	list2.stream().forEach(l->l));
		list2.add(list);
		System.out.println(list2);

		List<Double> ldb = Arrays.asList(1.1, 10.0, 5.7, 8.2);
		Collections.sort(ldb,(a,b)->{if(a==b) return 0; else if(a<b) return -11; return 1;});
		System.out.println(ldb);

		int[] abc = list.stream().mapToInt(i -> i.intValue()).toArray();

		int[] b = { 1, 2, 3 };

		Arrays.asList(1, 2, 3);

		int[] a = new int[l.size()];

		Collections.sort(l);
		System.out.println(l);
		for (int i = 0; i < l.size() - 1; i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i) < l.get(j)) {
					int temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);

				}
			}
		}
		int count=1;
		List<List<Integer>> l4 = new ArrayList<>();
		List<Integer> l5 = new ArrayList<>();
		for(int i =0;i<l.size()-1;i++)
		{
			if(l.get(i)==l.get(i+1))
			{
				count++;
			}
			else
			{
				l5 = new ArrayList<>();
				l5.add(l.get(i));
				l5.add(count);
				l4.add(l5);
				count=1;
			}
		}
		System.out.println(l4);
	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(50);
		l.add(15);
		l.add(9);
		l.add(100);
		l.add(100);
		l.add(15);
		l.add(15);

		sort(l);
		System.out.println(l);
		
		OptionalInt max = l.stream().mapToInt(Integer::intValue).max();
		System.out.println(max.getAsInt());
	}

}
