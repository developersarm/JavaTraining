package com.lambda;

import java.util.function.*;
import java.util.*;
import java.util.logging.*;

public class TestSuppliers {
  public static void main(String[] args) {

    // Example of suplier
    Supplier<Integer> answerSupplier = () -> 42;
    System.out.println("Answer to everything: " + answerSupplier.get());

    Supplier<String> userSupplier = () -> {
      Map<String, String> env = System.getenv();
      return env.get("USER");
    };
    System.out.println("User is: " + userSupplier.get());

    Random random = new Random();
    IntSupplier randomIntSupplier = () -> random.nextInt(50);
    int myRandom = randomIntSupplier.getAsInt();
    System.out.println("Random number: " + myRandom);

    Logger logger = Logger.getLogger("Status Logger");
    logger.setLevel(Level.SEVERE);
    // String currentStatus = "Everything's okay";
    // String currentStatus = "Something's horribly wrong!";
    // logger.log(Level.INFO, currentStatus);
    // logger.log(Level.SEVERE, currentStatus);
    Supplier<String> status = () -> {
      try {
        throw new Exception();
      } catch (Exception e) {
        return "down";
        // throw new Exception();
      }
    };

    try {
      logger.log(Level.INFO, status);
    } catch (Exception e) {
      logger.log(Level.SEVERE, status);
    }
  }
}
