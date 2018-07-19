package com.abhay;

class dedo {

	static int display (int c) {
		System.out.println("dedo's sop");
		return 3;
	}
	void display(int c, int d) {
		System.out.println("dedo's display2 sop");
	}
}

class lelo extends dedo{
	static int a = 0;
	static int b = 1;
	
	static int display (int c) {
//		System.out.println(a + b);
//		System.out.println(a + b + lelo.b);
//		lelo b = new lelo();
//		System.out.println(b);
		System.out.println("lelo's sop");
		return 3;
	}
	void display1() {
		System.out.println("lelo's display2 sop");
	}
}

public class JustTry {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		dedo d = new dedo();
		lelo l = new lelo();
		dedo a;
		a = d;
		System.out.println(a.display(2));
//		a.display1();
		a = l;
		System.out.println(a.display(3));
//		a.display1();
		l.display(3);
		l.display1();
	}
}
