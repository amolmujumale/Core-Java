package com.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BinarySearchTree {

	class Node {
		private int value;
		private Node left;
		private Node right;
	}

	public Node createNode(int value) {
		Node newNode = new Node();
		newNode.value = value;
		return newNode;
	}

	public Node createBinarySearch(Node root, int value) {
		if (root == null) {
			return createNode(value);
		} else if (value < root.value) {
			root.left = createBinarySearch(root.left, value);
		} else
			root.right = createBinarySearch(root.right, value);

		return root;
	}

	public void traverse(Node root) {
		if (root == null)
			return;
		traverse(root.left);
		System.out.println(root.value);
		traverse(root.right);
	}

	public static void main(String[] args) {

		BinarySearchTree obj = new BinarySearchTree();
		int[] input = { 10, 9, 11, 7, 8, 15, 5, 4, 3, 20 };
		Node root = null;
		for (int i = 0; i < input.length; i++) {
			root = obj.createBinarySearch(root, input[i]);
		}
		obj.traverse(root);
	}

}
