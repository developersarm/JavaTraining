package com.lambda;

public class DogsPlay {
  DogQuerier dogQuerier;
  public DogsPlay (DogQuerier dogQuerier) {
    this.dogQuerier = dogQuerier;
  }
  public boolean doQuery (Dog d) {
    return dogQuerier.test(d);
  }
}
