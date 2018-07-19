
public class MainClass {

	public static void main(String arg[]) {
		SomeClass cls = new SomeClass();
		A a = new A();
		B b = new B();
		C c = new C();
		X x = new X();
		Y y = new Y();
		cls.takeArg(a);
		cls.takeArg(b);
		cls.takeArg(c);
		cls.takeArg(x);
		cls.takeArg(y);
		
	}
}
