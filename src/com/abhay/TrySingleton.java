package com.abhay;

class Singleton {
	static Singleton instance = null;
	static int totalInstance = 0;
	
	Singleton() {}
	
	static Singleton getInstance () {
		if(totalInstance<3) {
			totalInstance++;
			instance = new Singleton();
		}
		else
			instance = null;
		return instance;
	}
}

 interface Abhay {
	void msg();
}

public class TrySingleton {
	public static void main(String[] args) {
		for(int i=0; i<8; i++) {
			Singleton a = Singleton.getInstance();
			System.out.println(a);
		}
	}
}


