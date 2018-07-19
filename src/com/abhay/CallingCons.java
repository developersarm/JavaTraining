package com.abhay;

class Cons1{
	Cons1(){
		System.out.println("Pehla nasha!!");
	}
}

class Cons2 extends Cons1 {
	Cons2() {
		System.out.println("Pehla Khumaar!!");
	}
}

class Cons3 extends Cons2 {
	Cons3()	{
		System.out.println("Naya pyaar hai, naya intezaar!!");
	}

	void Cons3() {
		// TODO Auto-generated method stub
		System.out.println("I am a function with constructor name!!");
	}
}

public class CallingCons {
	public static void main(String args[]) {
		Cons3 c = new Cons3();
		c.Cons3();
	}
}
