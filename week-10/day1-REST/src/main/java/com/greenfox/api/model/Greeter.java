package com.greenfox.api.model;

public class Greeter {
  private String welcome_message;

  public Greeter() {
  }

  public Greeter(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear student!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
