package com.overloading;

class Upper {
	void show (int a, Integer b) {
		System.out.println("show of upper with int");
	}
	
	void show (Integer a, int b) {
		System.out.println("show of upper with Integer");
	}
}

class Lower extends Upper {
	void show (Integer a, Integer b) {
		System.out.println("show of lower with int");
	}
}

public class Test {
	public static void main (String args[]) throws Exception{
		// Lower a = new Lower();
		// Upper c = new Upper();
		// c.show(1,2);
		// Integer b = 5;
		// a.show(1,b);
		System.out.println(Test.class == new Test().getClass());
	}
}