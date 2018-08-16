package com.serialization;

import java.io.*;

class A implements Serializable {
  int i = 10;
  A() {
    System.out.println("A's Constructor called");
  }
}

class B extends A {
  int j = 20;
  B() {
    System.out.println("B's constructor called");
  }
}

class C {
  int i = 10;
  C() {
    System.out.println("C's constructor called");
  }
}

class D extends C implements Serializable {
  int j = 20;
  D() {
    // super(10);
    System.out.println("D's constructor called");
  }
}

public class Inheritance {
  public static void main(String[] args) throws Exception{
    B b = new B();
    D d = new D();

    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("abc.ser"));
    os.writeObject(b);
    os.writeObject(d);

    ObjectInputStream is = new ObjectInputStream(new FileInputStream("abc.ser"));
    B b1 = (B) is.readObject();
    System.out.println(b1.i + "..." + b1.j);
    D d1 = (D) is.readObject();
    d.i = 100; // it doesn't get reflected in deserialied version
    System.out.println(d1.i + "..." + d1.j);

  }
}
