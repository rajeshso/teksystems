package com.teksystems.interview;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzTestStage2 {

  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";
  private static final String FIZZBUZZ = "FizzBuzz";

  @Test
  void given3ShouldReturnFizz() {
    String result = FizzBuzz.getFizzBuzzStage2(3);
    assertThat(result).isEqualTo(FIZZ);
  }

  @Test
  void given5ShouldReturnBuzz() {
    String result = FizzBuzz.getFizzBuzzStage2(5);
    assertThat(result).isEqualTo(BUZZ);
  }

  @Test
  void given15ShouldReturnFizzBuzz() {
    String result = FizzBuzz.getFizzBuzzStage2(15);
    assertThat(result).isEqualTo(FIZZBUZZ);
  }

  @Test
  void given1ShouldReturnTheNumber() {
    String result = FizzBuzz.getFizzBuzzStage2(1);
    assertThat(result).isEqualTo("1");
  }

  @Test
  public void given13ShouldReturnTheFizz() {
    String result = FizzBuzz.getFizzBuzzStage2(13);
    assertThat(result).isEqualTo(FIZZ);
  }

  @Test
  void given52ShouldReturnTheBuzz() {
    String result = FizzBuzz.getFizzBuzzStage2(52);
    assertThat(result).isEqualTo(BUZZ);
  }

  @Test
  void given53ShouldReturnTheBuzz() {
    String result = FizzBuzz.getFizzBuzzStage2(53);
    assertThat(result).isEqualTo(FIZZBUZZ);
  }

}
