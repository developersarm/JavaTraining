package com.abhay;

public class CharDemo2 {
	public static void main(String args[]) {
		char ch1;
		
		ch1 = 'X';
		System.out.println("ch1 contains " + ch1);
		
		ch1++;
		System.out.println("ch1 is now " + ch1);
		
		System.out.println("ch1 is now " + (char)(ch1 + 1) );
		
		byte b = (byte) 132;
		System.out.println(Integer.toBinaryString(b));
	}
}
