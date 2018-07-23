package com.exceptions;

public class SuperSubCatch {
	public static void main(String[] args) {
		try {
			int a = 42/0;
		} catch (Exception e) {
			System.out.println("Generic Exception catch.");
		} // catch (ArithmeticException e) {
//			System.out.println("This will not work");
//		}
	}
}
