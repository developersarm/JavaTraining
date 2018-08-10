package com.exceptions;

public class Exc2 {
	public static void main(String[] args) throws Exception {
		int d,a;

		try {
			d = 0;
			// a = 42/d;
			System.out.println("Will this be printed?");
			throw new InterruptedException();
		}
		catch(InterruptedException e) {
			System.out.println("Division by zero");
			throw e;
		}

		// System.out.println("After  catch statement.");
	}
}
