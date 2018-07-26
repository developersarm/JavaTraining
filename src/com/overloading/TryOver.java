package com.overloading;

class A {
    void show (int...a) {
        System.out.println("show int");
    }

    void show (double...a) {
        System.out.println("show Integer");
    }

    void show (byte...a) {
        System.out.println("show byte");
    }
}

class B extends A {
    
}

public class TryOver {
    public static void main (String ... args) {
        int[] a = new int[5];
        System.out.println(a.getClass().getName());        
    }
}