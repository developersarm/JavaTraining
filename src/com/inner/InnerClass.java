package com.inner;

class MyOuter {
  private int x = 7;
  public void makeInner() {
    MyInner in = new MyInner();
    in.seeOuter();
  }

  class MyInner {
    public void seeOuter() {
      System.out.println("Outer x is " + x);
      System.out.println("Inner Class ref is: " + this);
      System.out.println("Outer Class ref is: " + MyOuter.this);
    }
  }

  class MyChild extends MyInner {
    MyChild(){
      System.out.println("Constructor!");
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    MyOuter mo = new MyOuter();
    MyOuter.MyInner inner = mo.new MyInner();
    inner.seeOuter();
    MyOuter.MyChild child = mo.new MyChild();
    child.seeOuter();
  }
}
