package com.abhay;

class Ab {
	protected int i, j;
	
	void showij () {
		System.out.println("i and j: " + i + " " + j);
	}
}

class Bc extends Ab {
	int k;

	void showij() {
		System.out.println("k: " + k);
		return null;
	}

	void sum() {
		System.out.println("i+j+k: " + (i+j+k));
	}
}

public class SimpleInheritence {
	protected int i;
	public static void main(String args[])	{
		Ab superOb = new Ab();
		Bc subOb = new Bc();

		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of superOb: ");
		superOb.showij();
		System.out.println();

		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.showij();
//		subOb.showk();
		System.out.println();

		System.out.println("Sum of i, j and k in subOb:");
		subOb.sum();
	}
}
