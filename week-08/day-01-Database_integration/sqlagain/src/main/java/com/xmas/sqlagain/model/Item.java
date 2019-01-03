package com.xmas.sqlagain.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Item {
  @Id
  @GeneratedValue
  private long id;
  private String name;
  @CreationTimestamp
  private Date timestamp;
  private boolean isDone;

  public Item() {
  }

  public Item(String name, boolean isDone) {
    this.name = name;
    this.isDone = isDone;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }
}
