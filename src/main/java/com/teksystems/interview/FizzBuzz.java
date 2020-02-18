package com.teksystems.interview;

import static java.util.stream.IntStream.rangeClosed;

public class FizzBuzz {

  private static final String FIZZ_BUZZ = "FizzBuzz";
  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";

  protected static String getFizzBuzzStage1(int i) {
    if (i % 15 == 0) {
      return FIZZ_BUZZ;
    } else if (i % 3 == 0) {
      return FIZZ;
    } else if (i % 5 == 0) {
      return BUZZ;
    } else {
      return Integer.toString(i);
    }
  }

  protected static String getFizzBuzzStage2(int i) {
    if (i % 15 == 0 || (Integer.toString(i).contains("5") && Integer.toString(i).contains("3"))) {
      return FIZZ_BUZZ;
    } else if (i % 3 == 0 || Integer.toString(i).contains("3")) {
      return FIZZ;
    } else if (i % 5 == 0 || Integer.toString(i).contains("5")) {
      return BUZZ;
    } else {
      return Integer.toString(i);
    }
  }

  public static void main(String[] args) {
    System.out.println("***** Stage 1 *****");
    rangeClosed(1, 100).forEach(i -> System.out.println(getFizzBuzzStage1(i)));
    System.out.println("***** Stage 2 *****");
    rangeClosed(1, 100).forEach(i -> System.out.println(getFizzBuzzStage2(i)));
  }


}
