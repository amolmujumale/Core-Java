package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class MergeBST {

	Node root;

	static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.println(root.value);
		inorder(root.right);
	}

	public ArrayList<Integer> inorderStore(Node root, ArrayList<Integer> list) {
		if (root == null)
			return list;
		inorderStore(root.left, list);
		list.add(root.value);
		inorderStore(root.right, list);
		return list;
	}

	public ArrayList<Integer> mergeArray(ArrayList<Integer> l1, ArrayList<Integer> l2) {
		int i = 0, j = 0;
		ArrayList<Integer> l3 = new ArrayList<>();
		while (i < l1.size() && j < l2.size()) {
			if (l1.get(i) < l2.get(j)) {
				l3.add(l1.get(i));
				i++;
			} else if (l2.get(j) < l1.get(i)) {
				l3.add(l2.get(j));
				j++;
			}
		}
		while (i < l1.size()) {
			l3.add(l1.get(i));
			i++;
		}
		while (j < l2.size()) {
			l3.add(l2.get(j));
			j++;
		}
		return l3;
	}

	public Node createNode(int value) {
		return new Node(value);

	}

	public Node createTree(List<Integer> l, int left, int right) {
		if (left > right)
			return null;
		int mid = (left + right) / 2;
		Node root = createNode(l.get(mid));
		root.left = createTree(l, left, mid - 1);
		root.right = createTree(l, mid + 1, right);

		return root;

	}

	public static void main(String[] args) {
		MergeBST obj = new MergeBST();
		Node root1 = new Node(10);
		root1.left = new Node(5);
		root1.right = new Node(50);
		Node root2 = new Node(20);
		root2.left = new Node(15);
		root2.right = new Node(25);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1 = obj.inorderStore(root1, l1);
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2 = obj.inorderStore(root2, l2);
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3 = obj.mergeArray(l1, l2);
		System.out.println(l3);
		Node root3 = obj.createTree(l3, 0, l3.size() - 1);
		obj.inorder(root3);
	}

}
