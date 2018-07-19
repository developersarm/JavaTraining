package com.abhay;

class A {
	int i;
	private int j;
	
	void setij(int x, int y) {
		i = x;
		j = y;
	}
	
	int getj() {
		return j;
	}
}

class B extends A {
	int total;
	
	void sum()	{
		total = i + getj();
	}
}

public class Access {
	public static void main (String args[]) {
		B subOb = new B();
		
		subOb.setij(10, 12);
		
		subOb.sum();
		System.out.println("Total is " + subOb.total);
	}
}
