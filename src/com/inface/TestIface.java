package com.inface;

abstract class Client implements Callback {
//	public void callback (int param) {
//		System.out.println("callback called with " + param);
//	}
	void nonIfaceMeth()	{
		System.out.println("Classes that implement interfaces " + 
							"may also define other members, too.");
	}
}

class AnotherClient extends Client implements Callback, Callfront {
	public void callback (int p) {
		System.out.println(this.getClass().getInterfaces());
		System.out.println("p squared is :" + (p*p));
	}
}

public class TestIface {
	public static void main(String args[]) {
//		Callback c = new Client();
//		c.callback(2);
		// c.nonIfaceMeth();
		Callfront c = new AnotherClient();
		c.callback(5);
		AnotherClient a = new AnotherClient();
		a.nonIfaceMeth();
	}
}
