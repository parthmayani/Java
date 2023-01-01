package com.java31;

import java.util.Scanner;

public class Num112 {public static void main(String[] args) {
	System.out.println("enter two numbers");

	Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();

	System.out.println("Press 1 for addition, 2 for subtraction, 3 for mukltiplication , 4 for division");
	int opt = scan.nextInt();

	calculator(num1, num2, opt);

}

private static void calculator(int num1, int num2, int opt) {
	switch (opt) {
	case 1:
		System.out.println("addition of entered number = " + (num1 + num2));
		break;
	case 2:
		System.out.println("subtraction of entered number = " + (num1 - num2));
		break;
	case 3:
		System.out.println("multiplication of entered number = " + (num1 * num2));
		break;
	case 4:
		System.out.println("divition of entered number = " + (num1 / num2));
		break;

	}
}


}
