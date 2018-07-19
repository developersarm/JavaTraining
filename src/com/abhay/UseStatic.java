package com.abhay;

class TeraStatic {
	static int c;
	int d;
	static {
		System.out.println("TeraStatic init block");
	}
	static class SabkaStatic {
		static int l;
		int m;
		static void meth(int x) {
			System.out.println("x = " + x);
			System.out.println("a = " + c);
//			System.out.println("b = " + b);
			c = 3;
		}
		
//		static {
//			System.out.println("Inner Static block initialized");
////			b = a * 4;
////			d = b;
//			c = 4;
////			meth();
//		}
		
		void meth () {
			l = 3;
			System.out.println("Non static meth");
		}
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
	
	void meth () {
		a = 2;
	}
}

public class UseStatic {
	public static void main(String[] args) {
//		System.out.println("Main block started");
		TeraStatic t = new TeraStatic();
//		TeraStatic.SabkaStatic s = t.new SabkaStatic();
//		s.meth();
		MeraStatic.SabkaStatic.meth(3);
	}
}