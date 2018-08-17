package com.multithreading;

class DemoJoin {
  public static void main(String[] args) {
    NewThread3 ob1 = new NewThread3("One");
    NewThread3 ob2 = new NewThread3("Two");
    NewThread3 ob3 = new NewThread3("Three");

    System.out.println("Thread One is alive: " + ob1.t.isAlive());
    System.out.println("Thread Two is alive: " + ob2.t.isAlive());
    System.out.println("Thread Three is alive: " + ob3.t.isAlive());

    // wait for threads to finish
    try {
      System.out.println("Waiting for threads to finish. ");
      ob1.t.join();
      ob2.t.join();
      ob3.t.join();
      // System.out.println("this works!");

    } catch (InterruptedException e) {
      System.out.println("Main thread exiting.");
    }

    System.out.println("Thread One is alive: " + ob1.t.isAlive());
    System.out.println("Thread Two is alive: " + ob2.t.isAlive());
    System.out.println("Thread Three is alive: " + ob3.t.isAlive());

    System.out.println("Main thread exiting.");
  }
}
