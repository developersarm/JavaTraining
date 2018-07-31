package com.exception;

public class TestThrows {
  public static void msg() throws InterruptedException, InstantiationException { throw new InterruptedException();}

  public static void funThrow () throws Exception {
    try {
      msg();
    } catch (InstantiationException e) {
      throw e;
    } catch (InterruptedException e) {
      throw e;
    }
  }

  public static void main(String[] args) {
    try {
      funThrow();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
