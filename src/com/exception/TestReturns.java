package com.exception;

class Test{
	int show(int a) {
		int i = 10;
		try {
			return a/0;
		}
		catch (Exception e){
			return ++i;
		}
		finally {
			++i;
		}
//		System.out.println("line 15 works");
	}
}

public class TestReturns {
	public static void main(String[] args) {
		System.out.println(new Test().show(5));
	}
}
