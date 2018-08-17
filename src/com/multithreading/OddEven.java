package com.multithreading;

class Monitor {
  private boolean valueSet = false;

  boolean getValueSet () { return valueSet;}

  void setValueSet (boolean val) { valueSet = val;}
}

class Even implements Runnable {
  Thread t;
  Monitor m;

  Even(Monitor m) {
    this.m = m;
    t = new Thread(this, "Even");
    t.start();
  }

  public void run() {
    for(int i=0; i<=10; i++) {
      if(i%2==0) {
        if(m.getValueSet()) {
          try {
            synchronized(m) {
              wait();
            }
          } catch (InterruptedException e) {
            System.out.println("Even thread interrupted.");
          }
        }
        System.out.println(i);
        synchronized(m) {
          m.setValueSet(true);
          notify();
        }
      }
    }
  }
}

class Odd implements Runnable {
  Thread t;
  Monitor m;

  Odd(Monitor m) {
    this.m = m;
    t = new Thread(this, "Odd");
    t.start();
  }

  public void run() {
    for(int i=0; i<=10; i++) {
      if(i%2!=0) {
        if(!m.getValueSet()) {
          try {
            synchronized(m) {
              wait();
            }
          } catch (InterruptedException e) {
            System.out.println("Odd thread interrupted.");
          }
        }
        System.out.println(i);
        synchronized(m) {
          m.setValueSet(false);
          notify();
        }
      }
    }
  }
}

class OddEven {
  public static void main(String[] args) {
    Monitor m = new Monitor();
    new Even(m);
    new Odd(m);
  }
}
