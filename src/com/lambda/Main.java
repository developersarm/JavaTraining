package com.lambda;

public class Main {
  public static void main(String[] argv) {
    engine((int x,int y)-> x + y);
    // engine((long x, long y)-> x * y);
    // engine((int x,int y)-> x / y);
    // engine((long x,long y)-> x % y);
  }/*  w ww  .  java 2 s . com*/
  private static void engine(IntCalculator calculator){
    int x = 2, y = 4;
    int result = calculator.calculate(x,y);
    System.out.println(result);
  }
  private static void engine(LongCalculator calculator){
    int x = 2, y = 4;
    int result = calculator.calculate(x,y);
    System.out.println(result);
  }
}

@FunctionalInterface
interface IntCalculator{
  int calculate(int x, int y);
}

@FunctionalInterface
interface LongCalculator{
  int calculate(int x, int y);
}
