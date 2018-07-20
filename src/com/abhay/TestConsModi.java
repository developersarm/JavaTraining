package com.abhay;

class Bbcd {
	static final int b;
	Bbcd (int a){
//		b=a;
		System.out.println("Bbcd param cons");
	}
	Bbcd(){
//		b = 2;
	}
	{
//		b = 2;
	}
	static {
		System.out.println("Bbcd Static block");
		b = 5;
	}
	static void assign (int b) {
//		this.b = b;
	}
}

class Abcd extends Bbcd{
	static int a = 3;
	static Abcd instance = null;
	int b = 3;
	
	Abcd() {
		super(3);
		a = 0;
		System.out.println("Abcd default cons");
	}
	
	{
		System.out.println("Abcd Init block");
	}
	
	static {
		System.out.println("Abcd Static Block");
		instance = new Abcd();
	}
	
	Abcd(int b) {
//		super(a);
		this();
		this.a = b;
		System.out.println("Abcd param cons");
	}
}

public class TestConsModi {
	public static void main(String[] args) {
		Abcd a = new Abcd();
		System.out.println(a);
		System.out.println(Abcd.instance);
		System.out.println(Abcd.instance);
	}
}
