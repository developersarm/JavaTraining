package com.clone;

class A {
  public int a = 5;
  protected Object clone () {return new A();}
}

public class TestClone {
  public static void main(String[] args) {
    A a = new A();
    A b = (A) a.clone();
    System.out.println(b.a);
  }
}
