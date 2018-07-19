package com.abhay;

class bolo {
	static long a = 0;
	Number msg() {
		return msg();
	}
}

class kholo extends bolo{
	Integer msg() {
		return msg();
	}
}

public class Cov {
	public static void main(String[] args) {
		System.out.println(new kholo().msg());
	}
}
