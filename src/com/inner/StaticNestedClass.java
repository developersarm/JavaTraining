package com.inner;

class BigOuter {
  int a = 5;
  static int b = 6;

  static void go () { System.out.println("bye");}

  static class Nest extends BigOuter{
    static void go() {
      System.out.println("hi" + b);
    }
  }
}

public class StaticNestedClass {
  public static void main(String[] args) {
    BigOuter.Nest a = new BigOuter.Nest();
    BigOuter.Nest.go();
  }
}
