package com.java.polymorphism;

public class Fabonachiseries {
	public static void Fabseries() {
	int a=0;
	int b=1;
	int sum = a+b;
	System.out.println(a);
	System.out.println(b);
	for (int i=0;i<=10;i++)
	{
		 sum=a+b;
		
		System.out.println(sum);
		a=b;
		b=sum;
	}
	
	
	}
	public static void limitfab(int num)
	{
		int a=0;
		int b=1;
		int sum = a+b;
		System.out.println(a);
		System.out.println(b);
		for (int i=0;i<=10;i++)
		{
			
			sum=a+b;
			//System.out.println(sum);
			a=b;
			b=sum;
		
			if(sum<=num)
			{
				System.out.println(sum);
			}	
			else
				System.out.println("num is out of range");
		}
		
		
	}
public static void main(String[] args) {
	int num=100;
	
	Fabseries();
	System.out.println("new pogram");
	limitfab(num);
	
}
}
