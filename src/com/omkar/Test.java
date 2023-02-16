package com.omkar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		Employee e1= new Employee(1, "Omkar", 50.000, "25/08/1998");
		Employee e2= new Employee(2, "Sanket", 50.000, "25/08/1998");
		Employee e3= new Employee(3, "Vaibhav", 18.000, "09/04/1998");
		Employee e4= new Employee(4, "Sammed", 90.000, "26/11/1998");
		
		ArrayList<Employee> al= new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		

		Collections.sort(al);
		System.out.println(al);
	}
	
}
