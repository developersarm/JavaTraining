package com.exception;
import java.io.*;

class Bad implements Closeable {
  String name;
  Bad(String n) { name = n;}
  public void close() throws IOException {
    throw new IOException("Closing -" + name);
  }
}

class Sad implements AutoCloseable {
  String name;
  Sad(String n) { name = n;}
  public void close() throws Exception {
    throw new Exception("Closing -" + name);
  }
}

public class TestClosable {
  public static void fun() throws Exception{
    try(Bad b1 = new Bad("1"); Sad s2 = new Sad("2")) {
      // b1 = null; // implicitly final
      throw new Exception("Closing -" + 3);
    } catch (Exception e) {
      // System.out.println(e.getMessage());
      // throw new IOException("Closing -" + 4);
      throw e;
      // for(Throwable t: e.getSuppressed()) {
      //   System.out.println("suppressed:" + t);
      // }
    }
  }

  public static void main(String[] args) {
    try {
      fun();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      for(Throwable t: e.getSuppressed()) {
        System.out.println("suppressed:" + t);
      }
    }
  }
}
