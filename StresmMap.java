package com.java.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StresmMap {
	
	
	public static void main(String[] args)
	{
		Map<Integer, Integer> m = new HashMap<>();
		m.put(1, 1);
		m.put(5, 2);
		m.put(3, 7);
		m.put(10, 6);
		
		Map<Integer, Integer> sortedMap=m.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(mp->mp.getKey(),mp->mp.getValue()));
		System.out.println(sortedMap);
		
		List<Integer> l = Arrays.asList(1,3,4,5);
		for(Integer i:l)
		{
			System.out.println(i);
		}
		Integer[] a= l.toArray(new Integer[l.size()]);
		System.out.println(Arrays.toString(a));
		
		List<Integer> l2 = Arrays.asList(1,2,3);
		
		List<Integer> l3=l2.stream().filter(i->i.equals(2)).collect(Collectors.toList());
		System.out.println(l3);
		
		OptionalInt op = IntStream.rangeClosed(2, 10).filter(i->11%i==0).min();
		int sum = op.isPresent()?op.getAsInt():1;
		
		int[] z = {1,2,3,4};
		List<Integer> list5 = Arrays.stream(z).boxed().collect(Collectors.toList());
		System.out.println(list5);
		
		//System.out.println(l);
		
	}

}
