package com.lambda.genericfi;

public class TestGenFi {

  static <T,V> void test (Geni<? super Object,? super Object> g) {
    System.out.println(g.perform(3));
  }

  public static void main(String[] args) {
    test((a)->"abc");
  }
}
