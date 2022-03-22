package com.java.practice;

import java.util.LinkedList;
import java.util.Queue;

public class FordFulkerson2 {

	public static boolean bfs(int[][] rg, int s, int t, int[] parent) {
		int vertices = rg.length;
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[vertices];
		visited[s] = true;
		q.add(s);
		parent[s] = -1;
		while (!q.isEmpty()) {
			int current = q.poll();
			for (int i = 0; i < vertices; i++) {
				if (rg[current][i] > 0 && !visited[i]) {
					if (i == t) {
						parent[i] = current;
						return true;
					}
					parent[i] = current;
					q.add(i);
					visited[i] = true;

				}
			}
		}

		return false;
	}

	public static int fordFulkerson(int[][] g, int s, int t) {
		int maxFlow = 0, u = 0, v = 0;
		int vertices = g.length;
		int[] parent = new int[vertices];
		int[][] rg = new int[vertices][vertices];
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				rg[i][j] = g[i][j];
			}
		}

		while (bfs(rg, s, t, parent)) {
			int minPath = Integer.MAX_VALUE;
			for (v = t; v != s; v = parent[v]) {
				u = parent[v];
				minPath = minPath > rg[u][v] ? rg[u][v] : minPath;
			}
			for (v = t; v != s; v = parent[v]) {
				u = parent[v];
				rg[u][v] -= minPath;
				rg[v][u] += minPath;
			}
			maxFlow+=minPath;
		}

		return maxFlow;
	}

	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 16, 13, 0, 0, 0 }, { 0, 0, 10, 12, 0, 0 }, { 0, 4, 0, 0, 14, 0 },
				{ 0, 0, 9, 0, 0, 20 }, { 0, 0, 0, 7, 0, 4 }, { 0, 0, 0, 0, 0, 0 } };

		System.out.println("The maximum possible flow is " + fordFulkerson(graph, 0, 5));

	}

}
