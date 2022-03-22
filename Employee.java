package com.java.practice;

public class Employee {

	private static int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Integer method1()
	{
		System.out.println("Hello Method1");
		System.out.println(id);
		method2();
		return 1;
	}
	
	public  void method2()
	{
		System.out.println("Hello method2");
		System.out.println(id);
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
