package com.java31;
//exam result
//pass,fail,distinction,

import java.util.Scanner;

public class Ifelseif {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int num= scan.nextInt();
	
	if(num >100||num<0)
	{
		System.out.println("invalid marks");
	}
	
	else if(num>=75)
			{System.out.println("distionction");
				
			}
			else if(num>=60)
			{
				System.out.println("first class");
			}
			else if(num>=50)
			{
				System.out.println("second class");
			}
			else if(num>=40)
			{
				System.out.println("pass");
				
			}
			else
			{
				System.out.println("fail");
			}
}


}
