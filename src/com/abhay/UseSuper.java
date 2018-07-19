package com.abhay;

class Previous {
	int i;
	
	void print(int i, int j) {
		System.out.println("Mujhe bhi chala lo!!");
	}
}

class Next extends Previous {
	int i;
	
	void print(int i, int j) {
		this.i = i;
		super.i = j;
		System.out.println("i= "+this.i+" i= "+super.i);
		super.print(i, j);
	}
}
public class UseSuper {
	public static void main(String args[]) {
		Next n = new Next();
		n.print(1, 2);
	}
}
