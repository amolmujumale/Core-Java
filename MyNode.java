package com.java.practice;

public class MyNode {

	int value;
	MyNode next;
	
	
	
	public MyNode(int value) {
		this.value = value;
	}


	public MyNode() {
		super();
	}


	public void create(MyNode root)
	{
		MyNode currentNode = root;
		for(int i=0;i<5;i++)
		{
			MyNode node = new MyNode(i);
			currentNode.next=node;
			currentNode=node;
			
		}		
	}
	
	public void traverse(MyNode node)
	{
		while(node!=null)
		{
			System.out.println(node.value);
			node=node.next;
		}
	}
	
	
	public static void main(String[] args) {
		
		MyNode obj = new MyNode(10);
		obj.create(obj);
		obj.traverse(obj);

	}

}
