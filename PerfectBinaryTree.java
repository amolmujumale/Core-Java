package com.java.practice;

import com.java.practice.FullyBinaryTree.Node;

public class PerfectBinaryTree {

	Node root;

	static class Node {
		int value;
		Node left;
		Node right;

		public Node(int data) {
			this.value = data;
			left = right = null;
		}
	}

	public static int getDepth(Node root) {
		int d = 0;
		while (root != null) {
			root = root.left;
			d++;
		}
		return d;
	}

	public boolean isPerfectBinaryTree(Node root, int d, int index) {
		// 1 if tree is null
		if (root == null)
			return true;
		// 2 check children
		if (root.left == null && root.right == null) {
			return d == index + 1;
		}
		if (root.left == null || root.right == null)
			return false;
		//check subtree
		return (isPerfectBinaryTree(root.left, d, index+1) && isPerfectBinaryTree(root.right, d, index+1));
	}

	public static void main(String[] args) {
		PerfectBinaryTree obj = new PerfectBinaryTree();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		obj.root.right.left = new Node(6);
	//	obj.root.right.right = new Node(7);
		int d = getDepth(obj.root);
		if (obj.isPerfectBinaryTree(obj.root, d, 0))
			System.out.println("its a perfect binary tree");
		else
			System.out.println("its not a perfect binary tree");

	}

}
