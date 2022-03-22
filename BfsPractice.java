package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

public class BfsPractice {

	public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (List<Integer> l : edges) {
			List<Integer> l2 = map.get(l.get(0));
			if (l2 == null) {
				l2 = new ArrayList<>();
				l2.add(l.get(1));
			} else
				l2.add(l.get(1));
			map.put(l.get(0), l2);
		}
		System.out.println(map);
		int[] distance = new int[n + 1];
		Arrays.fill(distance, -1);
		int source = 2;
		distance[source] = 0;
		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		while (!q.isEmpty()) {
			int current = q.poll();
			List<Integer> l3 = map.get(current);
			if(l3!=null) {
			for (Integer i : l3) {
				if (distance[i] == -1) {
					distance[i]= distance[current]+6;
					q.add(i);
				}
			}
			}
		}
		int[] result = Arrays.copyOfRange(distance, 2, distance.length);
		return Arrays.stream(result).boxed().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<List<Integer>> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		l2.add(2);
		l2.add(3);
		l1.add(l2);
		List<Integer> result=bfs(3, 1, l1, 1);
		
	}

}
