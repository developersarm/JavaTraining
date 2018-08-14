package com.collection.list;

import java.util.*;

public class ConvertingArraystoList {

  public static Integer[] returnArray (Integer[] a) {
    return a;
  }
  public static void main(String[] args) {
    List<Integer> li;
    Integer array[] = {1,5,6,7};

    li = Arrays.asList(array);

    li.set(1,8);
    System.out.println(li.get(1));
    // li.add(9);
    // System.out.println(li.get(4));

    Integer[] array2 = {5,65,3,6};
    List<Integer> iL = new ArrayList<>();
    iL.add(6);
    iL.add(8);
    array2 = iL.toArray(array2);
    System.out.println(array2[0]);
    array2[0] = 2;
    System.out.println(array2[0]);
    iL.set(0,9);
    System.out.println(array2[0] + " " + iL.get(0));

    Integer[] a = returnArray(array2);
    // System.out.println(a[0]);
    for(Integer i: a) {
      System.out.print(i + " ");
    }

    System.out.println("\n");
    a[0] = 42;
    for(Integer i: array2) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
