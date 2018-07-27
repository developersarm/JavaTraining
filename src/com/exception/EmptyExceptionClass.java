package com.exception;

public class EmptyExceptionClass {
  public static void main(String[] args) {
    try {
      throw new CloneNotSupportedException();
    }
    catch (CloneNotSupportedException e) {
      try {
        System.exit(0);
        throw e;
      }
      catch (CloneNotSupportedException m) {
        System.out.println("catch 2");
      }
      finally {
        System.out.println("finally2");
      }
    }
    finally {
      System.out.println("finally1");
    }
  }
}
