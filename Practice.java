package com.java.practice;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice {

	public static void prims(int[][] g) {
		int vertices = g.length;
		int[] distance = new int[vertices];
		boolean[] visited = new boolean[vertices];
		Queue<Integer> q = new PriorityQueue<>((a, b) -> a - b);
		q.add(0);
		distance[0] = 0;
		Arrays.fill(distance, Integer.MAX_VALUE);
		int[] parent = new int[vertices];
		parent[0] = 0;
		while (!q.isEmpty()) {
			int u = q.poll();
			visited[u] = true;
			for (int v = 0; v < vertices; v++) {
				if (g[u][v] < distance[v] && !visited[v] && g[u][v]>0) {
					parent[v] = u;
					q.add(v);
					distance[v] = g[u][v];
				}
			}
		}
		for (int i = 0; i < vertices; i++) {
			System.out.println("U->V " + parent[i] + "->" + i + "=" + g[parent[i]][i]);
		}
	}

	public static void main(String[] args) {
		int graph[][] = { { 0, 2, 0, 6, 0 }, { 2, 0, 3, 8, 5 }, { 0, 3, 0, 0, 7 }, { 6, 8, 0, 0, 9 },
				{ 0, 5, 7, 9, 0 } };
		prims(graph);
	}

}
