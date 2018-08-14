package com.collection.map;

import java.util.*;

class Custom {
  String name;
  Custom (String a) {
    name = a;
  }
public String toString() { return name;}
}
public class Hashmap {
  public static void main(String[] args) {
    HashMap<Object, Object> hm = new HashMap<> ();
    hm.put(new Custom("abhay"),new Custom("boy"));
    hm.put(new Custom("suraj"),new Custom("boy"));
    hm.put(new Custom("amrutha"),new Custom("girl"));
    hm.put((short)121,new Custom("boy"));
    hm.put(new Custom("suchit"),new Custom("boy"));
    hm.put(new Custom("anushri"),7);
    System.out.println(hm);

    hm.forEach((a,b)->System.out.println(a+"->"+b));

    hm.put(121, new Custom("girl"));
    System.out.println(hm);
    hm.put(121, new Custom("girl"));
    System.out.println(hm);

    Iterator<Map.Entry<Object,Object>> i = hm.entrySet().iterator();
    while(i.hasNext()) {
      Map.Entry<Object,Object> temp = i.next();
      System.out.println(temp.getKey()+"->"+temp.getValue());
    }

    System.out.println(hm.get(121));
  }
}
