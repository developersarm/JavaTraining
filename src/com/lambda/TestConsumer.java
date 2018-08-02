package com.lambda;

import java.util.function.*;
import java.util.*;

public class TestConsumer {
  public static void main(String[] args) {
    Consumer<String> redOrBlue = pill -> {
      if (pill.equals("red")) {
        System.out.println("Down the rabbit hole");
      } else if (pill.equals("blue")) {
        System.out.println("Stay in lala land");
      }
    };
    redOrBlue.accept("red");

    // BiConsumer
    Map<String, String> env = System.getenv();
    BiConsumer<String, String> printEnv = (key, value) -> {
      System.out.println(key + ": " + value);
    };
    printEnv.accept("USER", env.get("USER"));

    // User of forEach(consumer<T>)
    List<String> dogNames = Arrays.asList("boi", "clover", "zooey");
    // Consumer<String> printName = name -> System.out.println(name);
    // dogNames.forEach(printName);
    dogNames.forEach(name -> System.out.println(name));

    // Using BiConsumer with forEach
    env.forEach(printEnv);
  }
}
