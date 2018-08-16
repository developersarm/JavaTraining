package com.serialization;

import java.io.*;

public class DeserializeSerialVersionUID {
  public static void main(String[] args) throws Exception{
    ObjectInputStream is = new ObjectInputStream(new FileInputStream("abc.ser"));
    SerialVersionUID s = (SerialVersionUID) is.readObject();

    System.out.println(s.i + "..." + s.j + "..." + s.name);
  }
}
