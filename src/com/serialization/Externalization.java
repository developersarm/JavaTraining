package com.serialization;

import java.io.*;

class Demo implements Externalizable {
  String s;
  int i;
  int j;

  public Demo() {
    System.out.println("Demo counstructor called");
  }

  Demo(String s, int i, int j) {
    this.s = s;
    this.i = i;
    this.j = j;
  }

  public void writeExternal (ObjectOutput o) throws IOException{
    o.writeObject(s);
    o.writeInt(i);
  }

  public void readExternal (ObjectInput in) throws IOException, ClassNotFoundException{
    s = (String) in.readObject();
    i = in.readInt();
  }
}

public class Externalization {
  public static void main(String[] args) throws Exception{
    Demo d = new Demo("Abhay", 68, 21);

    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("abc.ser"));
    os.writeObject(d);

    ObjectInputStream is = new ObjectInputStream(new FileInputStream("abc.ser"));
    Demo d1 = (Demo) is.readObject();

    System.out.println(d1.s + "..." + d1.i + "..." + d1.j);
  }
}
