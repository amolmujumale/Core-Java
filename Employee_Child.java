package com.java.practice;

public class Employee_Child extends Employee{
	
	public Integer method1()
	{
		return 2;
	}

	public  void method2()
	{
		System.out.println("child static");
	}

	public Employee_Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee_Child(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	
}
