package com.abhay;


public class TryBlocks {
	
	static {
		j=2;
	}
	TryBlocks(){
		j=20;
	}
	static int j;
	public static void main(String[] args) {
		TryBlocks a=new TryBlocks();
		System.out.println(TryBlocks.j);
	}
}
