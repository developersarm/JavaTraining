package com.inface;

class A {
	interface NestedIf{
		boolean isNotNegative(int x);
		int a = 0;
	}
}

class B implements A.NestedIf{
	public boolean isNotNegative (int x) {
		System.out.println("Value of a is " + a);
		return x<0?false:true;
	}
}

public class NestedIfDemo {
	public static void main(String args[]) {
		A.NestedIf nif = new B();
		
		if(nif.isNotNegative(10))
			System.out.println("10 is not negative");
		if(nif.isNotNegative(-12))
			System.out.println("won't work");
	}
}
