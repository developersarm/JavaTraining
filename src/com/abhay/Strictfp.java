package com.abhay;

strictfp class StrictUtl {
	float a = 4.64f;
	
	StrictUtl(float i){
		a = i;
	}
	
	float cal (float b) {
		return a+b;
	}
	
	strictfp void msg() {
		
	}
}

class Demo extends StrictUtl {
	Demo(float a){
		super(a);
	}
	
//	public boolean equals (Object o) {
//		return true;
//	}
//	
////	public int hashCode() {
////		return 1;
////	}
}

public class Strictfp {
	public static void main(String[] args) {
		StrictUtl a = new Demo(5.02f);
		System.out.println(a.hashCode());
	}
}


