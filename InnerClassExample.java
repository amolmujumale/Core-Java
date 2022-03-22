package com.java.practice;

public class InnerClassExample {

	private int id;

	class InnerClass {
		private String name;

		public InnerClass(String name) {
			this.name = name;
		}
		
		
	}

	public static void main(String[] args) {
		InnerClassExample outer = new InnerClassExample();
		InnerClass obj = outer.new InnerClass("amol");
		//InnerClass obj = new InnerClass("amol");
		
		
		
		
	}

}
