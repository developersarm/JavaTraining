package com.abhay;

class TryBlocks2 {
	
}

class TryBlocks1 {
//	static int i;
	int j = 3;
//	
//	TryBlocks1() {
////		this();
//		i = 0;
//		j = 3;
//		System.out.println("Constructor called!");
//	}
//	
//	TryBlocks1(int i){
//		this();
//		this.i = i;
//		System.out.println("Param Cons called!");
//	}
//	
//	
	{
//		this();
//		super();
//		i = 3;
//		j = 3;
		System.out.println("Init Block Called");
	}
//	
//	static {
////		this();
//		i = 2;
////		j = 2;
//		System.out.println("Static block called");
//	}
//	
//	{
////		this();
//		i = 3;
//		j = 3;
//		System.out.println("Init Block2 Called");
//	}
//	static {
////		this();
//		i = 2;
////		j = 2;
//		System.out.println("Static block2 called");
//	}
}

public class Blocks {
	public static void main(String[] args) {
		TryBlocks1 a = new TryBlocks1();
//		TryBlocks1 b = new TryBlocks1(6);
//		System.out.println(TryBlocks1.i);
//		System.out.println(TryBlocks1.i);
	}
}
