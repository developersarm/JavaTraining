package com.multithreading;

class NewThread1 extends Thread{
  NewThread1() {
    // Create a new Thread
    super("Demo thread");
    System.out.println("Child thread: " + this);
    start(); // Starts the thread
  }

  public void run() {
    try {
      for(int i = 5; i>0; i--) {
        System.out.println("Child Thread: " + i);
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      System.out.println("Child interrupted");
    }
    System.out.println("Exiting child thread");
  }
}

class NewThreadClass {
  public static void main(String[] args) {
    new NewThread1();

    try {
      for (int i=5; i>0; i--) {
        System.out.println("Main Thread: " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted");
    }
    System.out.println("Main thread exiting.");
  }
}
