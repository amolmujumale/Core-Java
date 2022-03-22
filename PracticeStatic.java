package com.java.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class PracticeStatic {

	public static void main(String[] args) {
		
		Employee e = new Employee_Child();
		//e.method1();
		//e.method2();
		//e.method2();
	//	DefaultInterface.method4();
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		String s = "2022-02-06";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date2=LocalDate.parse(s, formatter);
		System.out.println(date2);
		System.out.println(date.format(formatter));
		
		Optional o = Optional.empty();
		
		System.out.println(o);
	}

}
