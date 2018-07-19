package com.abhay;

class First {
	int i=9;
	String a = "abc";
	
	void show(int j) {
		System.out.println(i);
		System.out.println(a);
		System.out.println(j);
	}
}

class Second extends First {
	int j=3;
	void show() {
		super.show(j);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Second s = new Second();
		s.show();
	}
}
