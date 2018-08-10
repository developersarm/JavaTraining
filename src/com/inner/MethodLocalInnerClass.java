package com.inner;

class MyOuter2 {
  private String x = "Outer2";
  public MyOuter2 m = null;

  void seeOuter(){}

  static void doStuff () {
    String y = "doStuff method";
    abstract class Inner extends MyOuter2{
      public void seeOuter() {
        // y = "ello"; //This would never work!
        System.out.println("Outer x is " + x);
        System.out.println("doStuff x is " + y);
        MyOuter2.this.m = this;
      }
    }

    class Inner2 extends Inner {
      public void seeOuter() {
        System.out.println("Inner2 version");
        MyOuter2.this.m = this;
      }
    }
    // y = "abhay";
    Inner a = new Inner2();
    a.seeOuter();
  }
}

public class MethodLocalInnerClass {
  public static void main(String[] args) {
    MyOuter2 a = new MyOuter2();
    a.doStuff();
    a.m.seeOuter();
  }
}
