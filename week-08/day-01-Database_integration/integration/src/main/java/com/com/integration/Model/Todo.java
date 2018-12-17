package com.com.integration.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
  @Id
  @GeneratedValue
  private long id;
  private String title;
  private boolean isUrgent;
  private boolean idDone;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
    this.isUrgent = false;
    this.idDone = false;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public boolean isDone() {
    return isDone();
  }
}

