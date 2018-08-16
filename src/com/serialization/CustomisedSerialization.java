package com.serialization;

import java.io.*;

class Account implements Serializable {
  String name = "Abhay";
  transient String pass = "qwerty";

  private void writeObject (ObjectOutputStream os) throws Exception{
    os.defaultWriteObject();
    String epwd = "123" + pass;
    os.writeObject(epwd);
  }

  private void readObject (ObjectInputStream is) throws Exception{
    is.defaultReadObject();
    String epwd = (String) is.readObject();
    pass = epwd.substring(3);
  }
}

public class CustomisedSerialization {
  public static void main(String[] args) throws Exception{
      Account oldA = new Account();

      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("abc.ser"));
      os.writeObject(oldA);

      ObjectInputStream is = new ObjectInputStream(new FileInputStream("abc.ser"));
      Account newA = (Account) is.readObject();

      System.out.println(newA.name + "..." + newA.pass);
  }
}
