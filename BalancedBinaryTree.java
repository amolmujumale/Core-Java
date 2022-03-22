package com.java.practice;

import com.java.practice.FullyBinaryTree.Node;

public class BalancedBinaryTree {

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

	static class Height {
		int height;
	}

	public boolean isBalancedBinaryTree(Node root, Height height) {
		// 1 if tree is null
		/*
		 * if (root == null) { height.height = 0; return true; } Height leftHeight = new
		 * Height(); isBalancedBinaryTree(root.left, leftHeight); Height rightHeight =
		 * new Height(); isBalancedBinaryTree(root.right, rightHeight); int lh =
		 * leftHeight.height; int rh = rightHeight.height; height.height = (lh > rh ? lh
		 * : rh) + 1; if (lh - rh >= 2 || rh - lh >= 2) return false; else return true;
		 */
		if (root == null) {
			height.height = 0;
			return true;
		}
		Height leftHeight = new Height();
		isBalancedBinaryTree(root.left, leftHeight);
		Height rightHeight = new Height();
		isBalancedBinaryTree(root.right, rightHeight);
		int lh = leftHeight.height;
		int rh = rightHeight.height;
		height.height = (lh > rh ? lh : rh) + 1;
		if (lh - rh >= 2 || rh - lh >= 2)
			return false;
		else
			return true;

	}

	public static void main(String[] args) {
		BalancedBinaryTree obj = new BalancedBinaryTree();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		// obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		// obj.root.left.right = new Node(5);
		// obj.root.right.left = new Node(6);
		// obj.root.right.right = new Node(7);
		if (obj.isBalancedBinaryTree(obj.root, new Height()))
			System.out.println("its a balanced binary tree");
		else
			System.out.println("its not a balanced binary tree");

	}

}
