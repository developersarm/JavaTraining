package com.abhay;

class TeraStatic {
	static int c;
	TeraStatic instance = null;
	int d;
	static {
		System.out.println("TeraStatic init block");
	}
	
	static void msg() {
		System.out.println("Static method of TeraStatic");
		//SabkaStatic.l = 3;
	}
	static class SabkaStatic {
		int l = 32;
		int m;
		void meth(int x) {
			System.out.println("x = " + x);
			System.out.println("a = " + c);
//			System.out.println("b = " + b);
			c = 3;
		}
		
		static {
			System.out.println("Inner Static block initialized");
//			b = a * 4;
//			d = b;
//			c = 4;
//			meth();
		}
		
		void meth () {
//			l = 3;
			System.out.println("Non static meth");
		}
	}
}

class EkAurStatic extends TeraStatic.SabkaStatic{
	EkAurStatic (){
		super();
	}
}

class MeraStatic extends TeraStatic{
	static int a = 3;
	int b;
	
	MeraStatic () {
		b = 3;
	}
	static void meth(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
//		System.out.println("b = " + b);
		a = 3;
	}
	
	static {
		System.out.println("MeraStatic block initialized");
//		b = a * 4;
//		d = b;
		c = a;
//		meth();
	}
	
	static void msg () {
		System.out.println("Static method of MeraStatic");
		a = 2;
	}
}

public class UseStatic {
	public static void main(String[] args) {
//		System.out.println("Main block started");
//		EkAurStatic t = new EkAurStatic();
//		TeraStatic.SabkaStatic s = t.new SabkaStatic();
//		t.meth(3);
//		System.out.println(t.l);
//		MeraStatic m = new MeraStatic();
		MeraStatic.msg();
	}
}