package com.lambda;

import java.util.function.*;

public class TestSuppliers {
  public static void main(String[] args) {

    // Example of suplier
    Supplier<Integer> answerSupplier = () -> 42;
    System.out.println("Answer to everything: " + answerSupplier.get());
  }
}
