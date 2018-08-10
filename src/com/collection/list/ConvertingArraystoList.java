package com.collection.list;

import java.util.*;

public class ConvertingArraystoList {
  public static void main(String[] args) {
    List<Integer> li;
    Integer array[] = {1,5,6,7};

    li = Arrays.asList(array);

    li.set(1,8);
    System.out.println(li.get(1));
    li.add(9);
    System.out.println(li.get(4));
  }
}
