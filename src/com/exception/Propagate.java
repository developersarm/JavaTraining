package com.exception;

public class Propagate {
	
	public String reverse(String str) {
		String reverseStr = "";
		for(int i=str.length()-1; i>=0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}
		return reverseStr;
	}
	
	public static void main(String[] args) {
		Propagate p = new Propagate();
		try {
			System.out.println(p.reverse(null));
		}
		finally {
			System.out.println("Main ended!");
		}
	}
}
