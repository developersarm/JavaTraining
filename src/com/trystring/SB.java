package com.trystring;

public class SB {
	public static void main(String[] args) throws InterruptedException{
		String str = "ab";

		for(int i=0; i<100000; i++) {
			str = str + str;
			Thread.sleep(1000);
		}
		Thread.sleep(1000000);
	}
}
