package com.generics.array;

import java.util.*;

class Gen<T> {
  private T a;

  Gen(T t) {
    a = t;
  }

  static <T> void copy (List<? super T> dest, List<? extends T> src) {
    for (int i = 0; i < src.size(); i++)
        {
            dest.set(i, src.get(i));
        }
  }

}

class Test {
  public static void main(String[] args) {
    // Gen<Integer> g[] = new Gen<Integer>[10];
    // g[0] = new Gen<>(5);
    // System.out.println(g[0]);
    List<Number> n = new ArrayList<>();
    n.add(1);
    n.add(2);
    List<Integer> i = new ArrayList<>();
    i.add(5);
    i.add(6);

    Gen.<Number>copy(n,i);
  }
}
