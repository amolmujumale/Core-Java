package com.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerTree {

	static int evenForest(int t_nodes, int t_edges, List<Integer> t_from, List<Integer> t_to) {
		Map<Integer, List<Integer>> tree = new HashMap<>();
		int count = 0;
		for (int i = 1; i <= t_nodes; i++) {
			tree.put(i, new ArrayList<>());
		}
		for (int i = 0; i < t_edges; i++) {
			List<Integer> child = tree.get(t_to.get(i));
			child.add(t_from.get(i));
		}
		System.out.println(tree);
		for (int i = 2; i <= tree.size(); i++) {
			if ((noOfChildern(i, tree) % 2) != 0)
				count++;
		}

		return count;
	}

	public static int noOfChildern(int i, Map<Integer, List<Integer>> tree) {
		int totalChildren = tree.get(i).size();
		for (int j : tree.get(i)) {
			totalChildren += noOfChildern(j, tree);
		}
		return totalChildren;
	}

	public static void main(String[] args) {
		int t_nodes=10, t_edges=9;
		List<Integer> t_from = new ArrayList<>();
		List<Integer> t_to = new ArrayList<>();
		for(int i=2;i<=10;i++)
		t_from.add(i);
		t_to.add(1);
		t_to.add(1);
		t_to.add(3);
		t_to.add(2);
		t_to.add(1);
		t_to.add(2);
		t_to.add(6);
		t_to.add(8);
		t_to.add(8);
		System.out.println(evenForest(t_nodes,t_edges,t_from, t_to));
	}

}
