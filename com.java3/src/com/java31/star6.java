package com.java31;
//    *
//   * *
//  * * *
// * * * *
//* * * * * 

public class star6 {
	public static void main(String[] args) {
		int star=5, space=4;
		int rows=5;
		for(int i=1; i<=rows;i++)
		{
			for (int j=space; j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
				
	}

	

}
