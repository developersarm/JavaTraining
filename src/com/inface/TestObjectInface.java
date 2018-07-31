package com.inface;

interface A23 {
  void msg();
  
}

public class TestObjectInface {
  public void fun() {
    A23 a = null;
    a.equals(null);
  }
  public static void main(String[] args) {
    new TestObjectInface().fun();
  }
}
