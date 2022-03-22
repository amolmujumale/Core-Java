package com.java.practice;

import java.util.LinkedList;
import java.util.Queue;

public class FordFulkerson {

	public static boolean bfs(int[][] rg, int s, int t, int[] p) {
		int v = p.length;
		boolean[] visited = new boolean[v];
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		visited[s] = true;
		p[s] = -1;
		while (!q.isEmpty()) {
			int current = q.poll();
			for (int i = 0; i < v; i++) {
				if (rg[current][i] > 0 && !visited[i]) {
					if (i == t) {
						p[i] = current;
						return true;
					}
					q.add(i);
					visited[i] = true;
					p[i] = current;

				}
			}
		}
		return false;
	}

	public static int fordFulkerson(int[][] g, int s, int t) {
		int v = g.length, maxFlow = 0;
		int u = 0, k = 0;
		int[][] rg = new int[v][v];
		int[] parent = new int[v];
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				rg[i][j] = g[i][j];
			}
		}
		while (bfs(rg, s, t, parent)) {
			int pathFlow = Integer.MAX_VALUE;

			for (k = t; k != s; k = parent[k]) {
				u = parent[k];
				pathFlow = Math.min(pathFlow, rg[u][k]);
			}
			for (k = t; k != s; k = parent[k]) {
				u = parent[k];
				rg[u][k] -= pathFlow;
				rg[k][u] += pathFlow;
			}
			maxFlow += pathFlow;
		}
		return maxFlow;

	}

	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 16, 13, 0, 0, 0 }, { 0, 0, 10, 12, 0, 0 }, { 0, 4, 0, 0, 14, 0 },
				{ 0, 0, 9, 0, 0, 20 }, { 0, 0, 0, 7, 0, 4 }, { 0, 0, 0, 0, 0, 0 } };

		System.out.println("The maximum possible flow is " + fordFulkerson(graph, 0, 5));
	}
}
