package com.teksystems.interview;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzTestStage1 {

  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";
  private static final String FIZZBUZZ = "FizzBuzz";

  @Test
  void given3ShouldReturnFizz() {
    String result = FizzBuzz.getFizzBuzzStage1(3);
    assertThat(result).isEqualTo(FIZZ);
  }

  @Test
  void given5ShouldReturnBuzz() {
    String result = FizzBuzz.getFizzBuzzStage1(5);
    assertThat(result).isEqualTo(BUZZ);
  }

  @Test
  void given15ShouldReturnFizzBuzz() {
    String result = FizzBuzz.getFizzBuzzStage1(15);
    assertThat(result).isEqualTo(FIZZBUZZ);
  }

  @Test
  void given1ShouldReturnTheNumber() {
    String result = FizzBuzz.getFizzBuzzStage1(1);
    assertThat(result).isEqualTo("1");
  }
}
