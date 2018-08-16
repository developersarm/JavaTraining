package com.serialization;

import java.io.*;

class A implements Serializable {
  B b = new B();
}

class B implements Serializable {
  C c = new C();
}

class C implements Serializable {
  int i = 20;
}

public class ObjectGraphDemo {
  public static void main(String[] args) throws Exception {
    A a = new A();

    FileOutputStream fos = new FileOutputStream("abc.ser");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(a);

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ser"));
    A a2 = (A) ois.readObject();
    System.out.println(a2.b.c.i);
  }
}
