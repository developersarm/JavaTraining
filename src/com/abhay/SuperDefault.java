package com.abhay;

class Supa{
	int i;
	Supa(){
		i=0;
	}
}

class Pupa extends Supa {
	int j,i=2;
	Pupa(){
		i=super.i;
	}
}
public class SuperDefault {
	public static void main(String[] args) {
		Pupa p = new Pupa();
		System.out.println(p instanceof Pupa);
	}
}
