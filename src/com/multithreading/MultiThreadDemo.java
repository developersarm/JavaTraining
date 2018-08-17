package com.multithreading;

// import com.multithreading;

class NewThread3 implements Runnable {
  String name; // name of thread
  Thread t;
  NewThread3(String name) {
    this.name = name;
    t = new Thread(this, name);
    System.out.println("New thread: " + t);
    t.start();
  }

  public void run() {
    try {
      for(int i=5; i>0; i--) {
        System.out.println(name + ": " + i);
        t.sleep(5000);
      }
    } catch (InterruptedException e) {
      System.out.println(name + " Interrupted");
    }
    System.out.println(name + " exiting.");
  }
}

class MultiThreadDemo {
  public static void main(String[] args) {
    new NewThread3("One");
    new NewThread3("Two");
    new NewThread3("Three");

    try {
      for(int i=5; i>0; i--) {
        System.out.println("Main thread: " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Main thread Interrupted");
    }
    System.out.println("Main thread exiting.");
  }
}
