package com.java.practice;

public interface DefaultInterface {

	default void method1()
	{
		System.out.println("method1");
	}
	default void method2()
	{
		System.out.println("method1");
	}
	
	public static void method3()
	{
		System.out.println("interface static");
	}
	public static void method4()
	{
		System.out.println("interface static");
	}
}
