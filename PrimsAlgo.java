package com.java.practice;

import java.util.Arrays;

public class PrimsAlgo {
	
	public static int findMin(boolean[] v, int[] d)
	{
		int min =100;
		int vertex=0;
		for(int i=0;i<d.length;i++) {
			if(min>d[i] && !v[i])
			{
				min = d[i];
				vertex=i;
			}
		}
		return vertex;
	}

	public static void prims(int a[][]) {
		int vertices = a.length;
		int distance[] = new int[vertices];
		int source = 0;
		int[] parent = new int[vertices];
		boolean[] visited = new boolean[vertices];
		Arrays.fill(distance, 100);
		distance[source] = 0;
		parent[source] = 0;
		for (int i = 0; i < vertices-1; i++) {
			int minNode = findMin(visited, distance);
			visited[minNode]=true;
			for (int j = 0; j < vertices; j++) {
				if (a[minNode][j] != 0 && !visited[j] && distance[j] > a[minNode][j]) {
					distance[j] = a[minNode][j];
					parent[j] = minNode;
				}
			}
		}
			for(int i=0;i<vertices;i++)
			{
				System.out.println("U->V"+parent[i]+"->"+i+"="+a[parent[i]][i]);
			}
		
	}

	public static void main(String[] args) {
		int graph[][] = { { 0, 2, 0, 6, 0 }, { 2, 0, 3, 8, 5 }, { 0, 3, 0, 0, 7 }, { 6, 8, 0, 0, 9 },
				{ 0, 5, 7, 9, 0 } };
		prims(graph);
	}

}
