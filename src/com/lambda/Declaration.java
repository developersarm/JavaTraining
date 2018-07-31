package com.lambda;

public class Declaration {
  public static void main(String[] args) {
    Dog boi = new Dog ("boi", 30, 6);
    Dog clover = new Dog ("clover", 35, 12);

    // DogQuerier dq = new DogQuerier() {
    //   public boolean test (Dog d) { return d.getAge() > 9;}
    // };

    // using lambda expression
    DogQuerier dq = d -> d.getAge()>9;

    // using lambda inside function call
    DogsPlay dp = new DogsPlay (d -> d.getAge()>9);

    int numCats = 3;
    int numBalls = 4;
    DogQuerier dqWithCats = d -> {
      // int numCats = 3;  // CTE!
      // numCats++;  // CTE!
      System.out.println(numCats + numBalls);
      return d.getAge()>9;
    };

    System.out.println("Is Boi older than 9? " + dq.test(boi));
    System.out.println("Is Clover older than 9? " + dp.doQuery(clover));
  }
}
