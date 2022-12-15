package com.java.Oops.inheritance;

public class Test {
	public static void main(String[] args) {
		Child c=new Child();
		c.iphone();
		c.bunglow();
		Grandchild g=new Grandchild();
		g.chocolate();
int sum=c.y+g.z;
		System.out.println(sum);
	}

}
