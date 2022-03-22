package com.java.practice;

public class FullyBinaryTree {

	Node root;
	static class Node {
		int value;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.value = data;
			left=right=null;
		}
	}
	

	public boolean isFullyBinaryTree(Node root) {
		// 1 check if tree is empty
		if (root == null)
			return true;
		// 2 check if children are null
		if (root.left == null && root.right == null)
			return true;
		if(root.left == null || root.right == null)
			return false;
		// 3 check subtree
			return (isFullyBinaryTree(root.left) && isFullyBinaryTree(root.right));
	}

	public static void main(String[] args) {
		FullyBinaryTree obj = new FullyBinaryTree();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right= new Node(5);
		obj.root.right.left = new Node(6);
		obj.root.right.right = new Node(7);
		if(obj.isFullyBinaryTree(obj.root))
			System.out.println("its a fully binary tree");
		else
			System.out.println("its not a fully binary tree");
		
	}

}
