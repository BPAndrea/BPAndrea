package com.greenfox.api.model;

public class Result {
  private int result;

  public Result() {
  }

  public Result(String action, int until) {
    if (action.equals("sum")) {
      this.result = sumNumbers(until);
    } else if (action.equals("factor")) {
      this.result = factorNumbers(until);
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int sumNumbers(int until) {
    int result = 0;
    for (int i = 1; i <= until; i++) {
      result += i;
    }
    return result;
  }

  public int factorNumbers(int until) {
    int result = 1;
    for (int i = 1; i <= until; i++) {
      result *= i;
    }
    return result;
  }
}
