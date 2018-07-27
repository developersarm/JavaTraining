package com.trystring;

public class SB {
	public static void main(String[] args) {
		String str = "abc";
		
		for(int i=0; i<100000; i++) {
			str = str + "abc";
		}
	}
}
