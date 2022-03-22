package com.java.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GridObstaclePblm {

	public static int shortestPath(int[][] grid, int k) {
		int m = grid.length;
		int n = grid[0].length;
		Queue<int[]> q = new LinkedList<>();
		// Set<int[]> visited = new HashSet<>();
		boolean[][][] visited = new boolean[m][n][k+1];
		//int[] current = { 0, 0, k };

		q.add(new int[] {0,0,k});
		// visited.add(current);
		int steps = 0;

		int[][] dir = { { 0, +1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		while (!q.isEmpty()) {
			int size = q.size();
			
			while (size-- > 0) {
				int[] temp = q.poll();
				int row = temp[0];
				int col = temp[1];
				int obs = temp[2];
				if (row == m - 1 && col == n - 1)
					return steps;
				for (int i = 0; i < dir.length; i++) {
					if (col + dir[i][1] >= 0 && col + dir[i][1] < n && row + dir[i][0] >= 0 && row + dir[i][0] < m) {
						if (grid[row + dir[i][0]][col + dir[i][1]] == 0
								&& !visited[row + dir[i][0]][col + dir[i][1]][obs]) {
							q.add(new int[] { row + dir[i][0], col + dir[i][1], obs});
							visited[row + dir[i][0]][col + dir[i][1]][obs] = true;
						} else if (grid[row + dir[i][0]][col + dir[i][1]] == 1 && obs > 0
								&& !visited[row + dir[i][0]][col + dir[i][1]][obs-1] ) {
							q.add(new int[]{ row + dir[i][0], col + dir[i][1], obs-1 });
							visited[row + dir[i][0]][col + dir[i][1]][obs-1] = true;
						}
					}
				}
			}
			steps++;
		}
		return -1;

	}

	public static void main(String[] args) {

		int[][] input = { { 0, 0, 0 }, { 1, 1, 0 }, { 0, 0, 0 }, { 0, 1, 1 }, { 0, 0, 0 } };
		System.out.println(shortestPath(input, 1));

	}

}
