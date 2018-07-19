package com.abhay;

abstract class Hum1 {
	abstract void callme();
	void showre () {
		System.out.println("Hum 1 humare 1");
	}
}

class Hum2 extends Hum1 {
	void callme() {
		System.out.println("Kar dia call");
	}
	
	protected void showre () {
		System.out.println("Hum 2 humare 2");
	}
}

class Hum3 extends Hum2 {
	public void showre () {
		System.out.println("Hum 3 humare 3");
	}
}

public class Dispatch {
	public static void main(String args[]) {
		Hum2 h = new Hum2();
		h.showre();
		h = new Hum3();
		h.showre();
		// h.show();
		h.callme();
	}
}
