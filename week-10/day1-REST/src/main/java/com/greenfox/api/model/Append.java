package com.greenfox.api.model;

public class Append {
  private String appended;

  public Append() {
  }

  public Append(String appendable) {
    this.appended = appendable.concat("a");
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
