package com.inface;

class flatu{

}

//One interface can extend another.
interface Ab {
	void meth1();
	void meth2();
	
	static void print() {
		System.out.println("This is default method!");
	}

	default void msg() {

	}
}

//B now includes meth1() and meth2() -- it adds meth3().
interface Bc extends Ab {
	void meth3();
}

//This class must implement all of A and B
class MyClass implements Bc {
	public void meth1() {
		System.out.println("Implement meth1().");
	}
	public void meth2() {
		System.out.println("Implement meth2().");
	}
	public void meth3() {
		System.out.println("Implement meth3().");
	}
	public void print() {
		System.out.println("This is default changed!");
	}

	public void msg() {

	}
}

class MySecondClass implements Bc{
	public void meth1() {
		System.out.println("Implement meth1().");
	}
	public void meth2() {
		System.out.println("Implement meth2().");
	}
	public void meth3() {
		System.out.println("Implement meth3().");
	}
	public void msg() {
		System.out.println("Message from mysecondclass");
	}
}

class IFExtend {
	public static void main(String arg[]) {
		Bc ob = new MyClass();
		MyClass a = (MyClass) ob;
		System.out.println(a instanceof Bc);
		MySecondClass b = (MySecondClass) ob;
		System.out.println(b instanceof Bc);
//		ob.meth1();
//		ob.meth2();
//		ob.meth3();
//		ob.print();
	}
}
