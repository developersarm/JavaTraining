package com.inner;

class Popcorn {
  void pop() {
    System.out.println("Popcorn");
  }
}

interface Lolipop {
  void lol();
}

public class AnonymousInnerClass {
  public static void main(String[] args) {
    Popcorn a = new Popcorn() {
      void pop() {
        System.out.println("anonymous popcorn");
      }
      void pull() {}
    };
    a.pop();
    // a.pull();

    Lolipop b = new Lolipop () {
      public void lol() {
        System.out.println("anonymous lolipop");
      }

      void pull() {}
    };
    b.lol();
    // b.pull();
  }
}
