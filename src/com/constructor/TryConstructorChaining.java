package com.constructor;

class Upper {
int i;
}

class Down extends Upper {

}

public class TryConstructorChaining {
  public static void main(String[] args) {
    Down d = new Down();
    System.out.println("This is sparta");
  }
}
