package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class GraphShortDistance {

	public static void main(String[] args) {
		int noOfVertices = 6;
		int source = 0;

		List<List<Map<Integer, Integer>>> adjMatrix = new ArrayList<>();
		
		

		// 0
		Map<Integer, Integer> m1 = new HashMap<>();
		Map<Integer, Integer> m5 = new HashMap<>();
		List<Map<Integer, Integer>> l1 = new ArrayList<>();
		m1.put(1, 2);
		m5.put(2, 3);
		l1.add(m1);
		l1.add(m5);
		adjMatrix.add(l1);
		// 1
		m1 = new HashMap<>();
		m5 = new HashMap<>();
		l1 = new ArrayList<>();
		m1.put(3, 3);
		m5.put(4, 4);
		l1.add(m1);
		l1.add(m5);
		adjMatrix.add(l1);
		// 2
		m1 = new HashMap<>();
		m5 = new HashMap<>();
		l1 = new ArrayList<>();
		m1.put(3, 1);
		m5.put(5, 7);
		l1.add(m1);
		l1.add(m5);
		adjMatrix.add(l1);
		// 3
		m1 = new HashMap<>();
		l1 = new ArrayList<>();
		m1.put(5, 1);
		l1.add(m1);
		adjMatrix.add(l1);
		// 4
		m1 = new HashMap<>();
		l1 = new ArrayList<>();
		adjMatrix.add(l1);
		// 5
		m1 = new HashMap<>();
		l1 = new ArrayList<>();
		adjMatrix.add(l1);

		int[] distance = new int[noOfVertices];
		Arrays.fill(distance, 100);
		distance[source] = 0;

		Queue<Map<Integer, Integer>> q = new PriorityQueue<>((a,
				b) -> a.get(a.entrySet().stream().map(entry -> entry.getKey()).reduce(100, (f, g) -> f < g ? f : g)
						.intValue())
						- b.get(b.entrySet().stream().map(entry -> entry.getKey()).reduce(100, (f, g) -> f < g ? f : g)
								.intValue()));
		Map<Integer, Integer> initial = new HashMap<>();
		initial.put(source, source);
		q.add(initial);
		boolean[] visited = new boolean[noOfVertices];
		while (!q.isEmpty()) {
			Map<Integer, Integer> current = q.remove();

			int currentKey = current.entrySet().stream().map(entry -> entry.getKey())
					.reduce(100, (a, b) -> a < b ? a : b).intValue();
			visited[currentKey] = true;
			List<Map<Integer, Integer>> l2 = adjMatrix.get(currentKey);
			for (Map<Integer, Integer> m2 : l2) {
				int currentKey2 = m2.entrySet().stream().map(entry -> entry.getKey())
						.reduce(100, (a, b) -> a < b ? a : b).intValue();
				if (distance[currentKey2] > distance[currentKey] + m2.get(currentKey2) && !visited[currentKey2]) {
					distance[currentKey2] = distance[currentKey] + m2.get(currentKey2);
					q.add(m2);
				}
			}
		}
		System.out.println("distance from" + (char) (source + 'A') + " :");
		for (int i = 0; i < noOfVertices; i++) {
			System.out.println("Distance to: " + (char) (i + 'A') + " is " + distance[i]);
		}

	}

}
