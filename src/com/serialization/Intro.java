package com.serialization;

import java.io.*;

class Dog implements Serializable{
  String name;
  int i;
  transient int j = 100;
  transient final int k; // gets affected if initialization is not with declaration
  transient static int l = 40; // doesn't get affected by transient

  // {
  //   k = 555;
  // }

  Dog(String name, int i, int j, int k, int l) {
    this.name = name;
    this.i = i;
    this.j = j;
    this.k = k;
    this.l = l;
  }
}

class Cat implements Serializable { }

class Rat implements Serializable { }

public class Intro {
  public static void main(String[] args) throws Exception{
      Dog d1 = new Dog("Jason", 5, 500, 555, 768);
      Cat c1 = new Cat();
      Rat r1 = new Rat();

      //Serialization
      FileOutputStream fos = new FileOutputStream("abc.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(d1);
      oos.writeObject(c1);
      oos.writeObject(r1);

      //Deserialization
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ser"));
      Dog d2 = (Dog) ois.readObject();
      // Rat r2 = (Rat) ois.readObject(); // ClassCastException - order should be same as that of serialization
      Cat c2 = (Cat) ois.readObject();
      Rat r2 = (Rat) ois.readObject();
      
      System.out.println(d2.name + " " + d2.i + " " + d2.j+ " " + d2.k + " " + d2.l);
  }
}
