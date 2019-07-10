package main;

import java.util.Scanner;

public class Launch {
	
	public static float a;
	public static float b;
	
	public static String operation;
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static Maths maths;
	
	public static void main(String[] args) {
		System.out.println("Type in first number: ");
		a = scanner.nextFloat();
		System.out.println("Type in second number: ");
		b = scanner.nextFloat();
		System.out.println("Type operation +, -, *, /: ");
		operation = scanner.next();
		maths = new Maths(a,b);
		if(operation.contains("+")) {
			System.out.println("Your answer is: " + maths.add());
		}else if(operation.contains("-")){
			System.out.println("Your answer is: " + maths.subtract());
		}else if(operation.contains("*")) {
			System.out.println("Your answer is: " + maths.multiply());
		}else if(operation.contains("/")){
			System.out.println("Your answer is: " + maths.divide());
		}
	}
	
}
