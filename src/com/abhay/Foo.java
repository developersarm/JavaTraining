package com.abhay;

class Bar {
	public void print() {
		System.out.println(Constants.a);
	}
}

public class Foo {
	public static void main(String args[]) {
		Bar b = new Bar();
		b.print();
	}
}