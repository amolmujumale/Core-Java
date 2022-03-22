package com.java.practice;

import com.java.practice.FullyBinaryTree.Node;

public class CompleteBinaryTree {

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

	public static int getNodeCount(Node root) {
		if (root == null)
			return 0;
		return (1 + getNodeCount(root.left) + getNodeCount(root.right));

	}

	public boolean isCompleteBinaryTree(Node root, int index, int nodeCount) {
		// 1 if tree is null
		if (root == null)
			return true;
		// 2 check children
		if (index >= nodeCount) {
			return false;
		}
		return (isCompleteBinaryTree(root.left, 2 * index + 1, nodeCount)
				&& isCompleteBinaryTree(root.right, 2 * index + 1, nodeCount));
	}

	public static void main(String[] args) {
		CompleteBinaryTree obj = new CompleteBinaryTree();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		obj.root.right.right = new Node(6);
		// obj.root.right.right = new Node(7);
		int d = getNodeCount(obj.root);
		if (obj.isCompleteBinaryTree(obj.root, 0, d))
			System.out.println("its a complete binary tree");
		else
			System.out.println("its not a complete binary tree");

	}

}
