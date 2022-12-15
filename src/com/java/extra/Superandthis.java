package com.java.extra;

public class Superandthis {
	int a=4;
	int b=6;
	static int c=5;
		public static void sum()
		{Superandthis obj =new Superandthis();
			int d=8;
			int sum=obj.a+obj.b+c+d;
			System.out.println(sum);
		}
		public void sub()
		{
			int e=100;
			int sub =e-c-a-b;
			System.out.println(sub);
		}
		public static void main(String[] args) {
			Superandthis obj=new Superandthis();
			
			sum();
			obj.sub();
		}

}
