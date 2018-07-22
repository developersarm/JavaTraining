package com.abhay;

class Up {
	
}

class Middle extends Up{
	
}

class Down extends Up{
	static void createInstance(Up a) {
		if(a instanceof Down) {
			Down d = (Down) a;
			System.out.println("Down one");
		}
		else if (a instanceof Middle) {
			System.out.println("Middle one");
		}
		else
			System.out.println("Exception generated");
	}
}

public class DownCastingWithInstanceOf {
	public static void main(String[] args) {
		Up a = new Middle();

		Down.createInstance(a);
	}
}
