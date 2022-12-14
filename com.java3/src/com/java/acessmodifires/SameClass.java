package com.java.acessmodifires;

import com.java31.Methodclass1;

public class SameClass // parent class 
{
	private static void Method1()
	{
		System.out.println("Method 1 private");
	}
	 static void Method2()
	{
		System.out.println("Method 2 default ");
	}
	protected static void Method3()
	{
		System.out.println("Method 3 protected ");
	}
	public static void Method4()
	{
		System.out.println("Method 4 public");
	}
	private  void Method5()
	{
		System.out.println("Method 5 private no static");
	}
	  void Method6()
	{
		System.out.println("Method 6 default non static ");
	}
	protected  void Method7()
	{
		System.out.println("Method 7 protected non static ");
	}
	public  void Method8()
	{
		System.out.println("Method 8 public non static");
	}
	public static void main(String[] args) {
		Method1();
		Method2();
		Method3();
		Method4();
		SameClass object=new SameClass();
		object.Method5();
		object.Method6();
		object.Method7();
		object.Method8();
		
	}
}
