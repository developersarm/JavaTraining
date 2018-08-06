package com.generics.intro;

public class Gen<T> {
  T ob;

  Gen(T o) {
    ob = o;
  }

  T getOb() {
    return ob;
  }

  void showType() {
    System.out.println("Type of T is " + ob.getClass().getName());
  }
}

class GenDemo {
  public static void main(String[] args) {
    Gen<Integer> iOb;

    iOb = new Gen<Integer>(88);
    // iOb = new Gen<Double>(88.0); // Gen<Double> can't be converted into Gen<Integer>
    // Gen<int> a = new Gen<int> (8); // unexpected error
    iOb.showType();

    int v = iOb.getOb();
    System.out.println("value: " + v);

    System.out.println();

    Gen<String> strOb = new Gen<String> ("Generics Test");

    strOb.showType();

    String str = strOb.getOb();
    System.out.println("value: " + str);

    // iOb = strOb; // incompatible types
  }
}
