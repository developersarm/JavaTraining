package com.nestedstatic;

import static com.inner.StaticSin.*;
import static java.lang.Math.*;

class Outer {
  private static int a;
  static int b;
  protected static int c;
  public static int d;

  private static class InnerPrivate {
    private static int a1;
    static int b1;
    protected static int c1;
    public static int d1;
  }
  static class InnerDefault extends InnerPrivate{
    private static int a2;
    static int b2;
    protected static int c2;
    public static int d2;
  }
  protected static class InnerProtected {
    private static int a3;
    static int b3;
    protected static int c3;
    public static int d3;
  }
  public static class InnerPublic {
    private static int a4;
    static int b4;
    protected static int c4;
    public static int d4;
  }
}

public class TryStaticClass {
  // public static double sin (double a) {return 2.0;}
  public static void main(String[] args) {
    // Outer.InnerPrivate a = new Outer.InnerPrivate(); // won't work
    Outer.InnerDefault b = new Outer.InnerDefault();
    // System.out.println(b.a2);
    System.out.println(b.b2);
    System.out.println(b.c2);
    System.out.println(b.d2);
    Outer.InnerProtected c = new Outer.InnerProtected();
    Outer.InnerPublic d = new Outer.InnerPublic();
    // System.out.println(sin(1.0)); // ambiguous call CTE
  }
}
