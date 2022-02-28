package com.Runner.com;

import com.base.com.pojo_Class;

public class pojo 
{
	public static void main(String[] args) 
	{
		pojo_Class obj = new pojo_Class();
		obj.setAge(25);
		obj.setName("poovi");
		int age = obj.getAge();
		String name = obj.getName();
		
		System.out.println(age);
		System.out.println(name);
		
	}

}
