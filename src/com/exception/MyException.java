package com.exception;

class BadFoodException extends Exception {}

public class MyException {
	public static void main(String[] args) {
		MyException e = new MyException();
		try {
			e.checkFood(args);
		}
		catch (BadFoodException ex) {

		}
		finally {
			System.out.println("finally statement");
		}
	}

	void checkFood (String...s) throws BadFoodException{
		boolean foodSwitch = false;
		for(String i:s) {
			if(i.equals("Gobhi")) {
				foodSwitch = true;
			}
		}
		if (!foodSwitch) {
			throw new BadFoodException();
		}
		System.out.println("I like how it feels!");
	}
}
