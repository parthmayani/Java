package com.java31;

public class Forlopp3 {
	public static void main(String[] args) {
	  int count=0;  
	for(int i=10;i<=200;i++)
		{
	if (i%3==0 || i%7==0)
		{
			System.out.println(i);
			count++;
		}
		}
	System.out.println("total number=" +count);
	}

	

}
