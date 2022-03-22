package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphMinDistance {

	public static void main(String[] args) {

		int noOfVertices = 7;
		int startVertex = 2;
		List<Integer>[] adj = new ArrayList[noOfVertices];
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(3);
		adj[0] = l1;
		
		l1 = new ArrayList<>();
		l1.add(3);
		l1.add(4);
		adj[1] = l1;
		
		l1 = new ArrayList<>();
		l1.add(0);
		l1.add(5);
		adj[2] = l1;
		
		l1 = new ArrayList<>();
		l1.add(5);
		l1.add(6);
		adj[3] = l1;
		
		l1 = new ArrayList<>();
		l1.add(6);
		adj[4] = l1;
		
		l1 = new ArrayList<>();
		adj[5] = l1;
		
		l1 = new ArrayList<>();
		l1.add(5);
		adj[6] = l1;
		
		int path[] = new int[noOfVertices];
		int distance[] = new int[noOfVertices];
		Arrays.fill(distance, -1);
		distance[startVertex] = 0;
		path[startVertex] = startVertex;
		Queue<Integer> q = new LinkedList<>();
		q.add(startVertex);
		while(!q.isEmpty())
		{
			int vertex = q.remove();
			List<Integer> adjVert = adj[vertex];
			for(Integer i:adjVert)
			{
				if(distance[i]==-1)
				{
					distance[i] = distance[vertex] + 1;
					path[i] = vertex;
					q.add(i);
				}
			}
		}
		System.out.println("distance from"+(char)(startVertex+'A')+" :");
		for(int i=0;i<noOfVertices;i++)
		{
			System.out.print("Distance to: "+(char)(i+'A')+" is "+distance[i]);
			System.out.println("from path: "+ (char) (path[i]+'A'));
		}
	
	}

}
