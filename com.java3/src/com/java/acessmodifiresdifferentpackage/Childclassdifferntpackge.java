package com.java.acessmodifiresdifferentpackage;

import com.java.acessmodifires.SameClass;

public class Childclassdifferntpackge extends SameClass {
	public static void main(String[] args) {
		
		SameClass.Method3();
		SameClass.Method4();
		
		Childclassdifferntpackge object=new Childclassdifferntpackge();
				object.Method7();
		object.Method8();
		SameClass ob=new SameClass();
		ob.Method8();
		
		
		
	}
	

}
