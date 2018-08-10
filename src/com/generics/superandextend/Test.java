package com.generics.superandextend;

import java.util.*;

public class Test {

    public class A {}

    public class B extends A {}

    public class C extends B {}

    public void testCoVariance(List<? extends B> myBlist) {
        B b = new B();
        C c = new C();
        // myBlist.add(b); // does not compile
        // myBlist.add(c); // does not compile
        A a = myBlist.get(0);
    }

    public void testContraVariance(List<? super B> myBlist) {
        B b = new B();
        C c = new C();
        myBlist.add(b);
        myBlist.add(c);
        A a = myBlist.get(0); // does not compile
    }
}
