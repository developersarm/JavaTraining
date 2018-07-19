package com.abhay;

class Loca{
	void msg(int i)	{
		int j = 3;
		System.out.println("i + j = " + (i+j));
	}
}

public class LocalV {
	public static void main(String[] args) {
		new Loca().msg(3);
	}
}
