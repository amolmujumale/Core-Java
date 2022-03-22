package com.java.practice;

public class BinarySearchTree2 {
	private Node root;

	class Node {
		int value;
		Node left;
		Node right;
	}

	public Node createNode(int value) {
		Node newNode = new Node();
		newNode.value = value;
		return newNode;
	}

	public Node createTree(Node node, int value) {
		if (node == null)
			return createNode(value);
		else if (value < node.value)
			node.left = createTree(node.left, value);
		else if (value > node.value)
			node.right = createTree(node.right, value);
		return node;
	}

	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.value + " ");
		inorder(root.right);
	}

	public void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.value + " ");
	}

	public void preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.value + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void main(String[] args) {
		int[] input = { 50, 25, 60, 10, 11, 90, 5 };
		BinarySearchTree2 obj = new BinarySearchTree2();
		for (int i = 0; i < input.length; i++) {
			obj.root = obj.createTree(obj.root, input[i]);
		}
		System.out.println("Inorder traversal is");
		obj.inorder(obj.root);
		input = new int[] { 50, 25, 60, 10, 11, 90, 5 };
		System.out.println();
		System.out.println("Postorder traversal is");
		obj.postorder(obj.root);
		input = new int[] { 50, 25, 60, 10, 11, 90, 5 };
		System.out.println();
		System.out.println("Preorder traversal is");
		obj.preorder(obj.root);
	}

}
