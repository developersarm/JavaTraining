package com.finalkeyword;

abstract class A {
  final void msg(){System.out.println("Mahi marr raha hai");}
}

public class FinalinAbstract extends A{
  public static void main(String[] args) {
    new FinalinAbstract().msg();
  }
}
