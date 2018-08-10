package com.exception;

public class ChainedException {
  public static void demoproc() throws NullPointerException{
    NullPointerException e = new NullPointerException("top layer");
    e.initCause(new ArithmeticException("cause"));
    throw e;
  }

  public static void main(String[] args) {
    try {
      demoproc();
    } catch (NullPointerException e) {
      System.out.println("Caught: " + e);
      System.out.println(e.getCause());
    }
  }
}
