package com.generics.boundedtypes;

public class Stats <T extends Number> {
  T[] nums;

  Stats (T[] o) {
    nums = o;
  }

  double average () {
    double sum = 0.0;

    for (int i = 0; i < nums.length; i++ ) {
      sum += nums[i].doubleValue();
    }

    return sum/nums.length;
  }

  // <X extends Number> boolean sameAvg(Stats<X> ob) {
  //   if (average() == ob.average()) {
  //     return true;
  //   }
  //   return false;
  // }
  boolean sameAvg(Stats<?> ob) {
    if (average() == ob.average()) {
      return true;
    }
    return false;
  }
}

class StatsDemo {
  public static void main(String[] args) {
    Integer inums[] = {1,2,3,4,5};
    Stats<Integer> iOb = new Stats<>(inums);
    double v = iOb.average();
    System.out.println("iob average is " + v);

    Double dnums[] = {1.0,2.0,3.0,4.0,5.0};
    Stats<Double> dOb = new Stats<Double> (dnums);
    double w = dOb.average();
    System.out.println("dob average is " + w);

    // String strs[] = {"1", "2", "3"};
    // Stats<String> strob = new Stats<>(strs); // not within bound

    if(iOb.sameAvg(dOb)) {System.out.println("Averages are same");}
    else System.out.println("Averages differ");
  }
}
