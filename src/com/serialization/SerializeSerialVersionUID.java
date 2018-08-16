package com.serialization;

import java.io.*;

public class SerializeSerialVersionUID {
  public static void main(String[] args) throws Exception{
    SerialVersionUID s = new SerialVersionUID();

    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("abc.ser"));
    os.writeObject(s);
  }
}
