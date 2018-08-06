package com.functionalinterface;

import java.util.function.*;

class A {
  static void printV () {
    System.out.println("No param, no return");
  }

  static int printI () {
    System.out.println("No param, one return");
    return 1;
  }

  static int printIA (int a) {
    System.out.println("One param, one return");
    return a+1;
  }

  static void printA (int a) {
    System.out.println("One param, no return");
  }
}

public class TestFuns {
  public static void main(String[] args) {
    Supplier<Integer> s1 = A::printI;
    Supplier<Integer> s2 = ()->A.printI();
    System.out.println(s1.get());
    System.out.println(s2.get());
    Consumer<Integer> c1 = A::printA;
    Consumer<Integer> c2 = (a)->A.printA(a);
    c1.accept(5);
    c2.accept(5);
    Predicate<Integer> p = (a)->a>5;
    if(p.test(6)) {System.out.println("Predicate works");}
    Function<String,Integer> f1 = A::printIA;
    Function<String,Integer> f2 = (a)->A.printIA(a);
    System.out.println(f1.apply(7));
    System.out.println(f2.apply(7));
  }
}
