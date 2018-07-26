package com.initializer;

class Init {
  static int a ;
  int b = 3;

  {
    System.out.println(this.c);
    // c = 4;
  }

  int c;

  void see() {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}

public class TryInitializers {
  public static void main(String[] args) {
    new Init().see();
  }
}
