package com.generics.intro;

class Gen1<T> {
  T ob;
  Gen1(T ob) {
    this.ob = ob;
  }
  T getOb() {
    return ob;
  }
}

public class Test {
  public static void main(String[] args) {
    Gen1<Integer> a= new Gen1<>(40);
    Gen1 d;
    d = new Gen1(a.getOb());
  }
}
