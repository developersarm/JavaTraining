package com.abhay;

public class ByteShift {
	static public void main(String args[]) {
		byte a = 127;
		a <<= 1;
		System.out.println(a);
		char c = 'a';
		c = (char)(c+1023423423334535324L);
		int i = c +1;
		short d = 234;
		d = a;
		System.out.println(c);
		byte b = -128;
		System.out.println(Integer.toHexString(b>>>1));
	}
}
