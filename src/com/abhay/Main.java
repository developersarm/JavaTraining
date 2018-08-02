package com.abhay;

class Parent {

  public int s = 452;

  public void show(Parent parent) {
    int s = 9999999;
    System.out.println("Printing data members...");
    System.out.println(s);
    System.out.println(this.s);
    System.out.println(parent.s);
    // System.out.println(parent.p);
    System.out.println("Calling display...");
    display();
    this.display();
    parent.display();
  }

  public void display() {
    System.out.println("Parent");
  }
}

class Child extends Parent {

  public int s = 6234;
  public int p = 123;

  public void display() {
    System.out.println("Child");
  }
}

public class Main {

  public static void main(String[] args) {
    Child a = new Child();
    Child b = new Child();
    // a.show(a);
    // System.out.println();
    // a.show(b);
    Parent p1 = new Parent();
    Parent p2 = new Child();
    p2.show(p1);
  }
}
