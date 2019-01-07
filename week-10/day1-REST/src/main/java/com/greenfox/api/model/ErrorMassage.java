package com.greenfox.api.model;

public class ErrorMassage {
  private String error;

  public ErrorMassage(String error) {
    this.error = error;
  }

  public ErrorMassage() {
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
