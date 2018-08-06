package com.generics.types;

class Mobile <T extends Number> extends Throwable{
  // static T a;
  <T extends Short> double getVal (T o) {
    // T a = new T();
    return 0.0;
  }

  static <T> void lelo (T t) {
    System.out.println(t);
  }
}

class Gen extends Mobile<Integer>{
  private double val;
  // Generic constructor
  <T extends Number> Gen(T o) {
    val = o.doubleValue();
  }
  // Generic method
  public <T extends Number> double getVal (T o) {
    return val;
  }

  public <V extends Integer> double getVal (V o) {
    return 6.0;
  }
}

public class TypeDemo {
  public static void main(String[] args) {
    Gen g = new Gen(5);
    System.out.println(g.getVal(5));

    Mobile <Integer> m = new Mobile<>();

    System.out.println(m instanceof Mobile<?>);
  }
}
