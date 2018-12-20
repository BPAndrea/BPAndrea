package com.greenfox.reddit.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Blog {
  @Id
  @GeneratedValue
  private long Id;
  private String title;
  private String content;
  private int likes;

  public Blog(long id, String title, String content, int likes) {
    Id = id;
    this.title = title;
    this.content = content;
    this.likes = likes;
  }

  public Blog(long id, String title, int likes) {
    Id = id;
    this.title = title;
    this.content = title;
    this.likes = likes;
  }
  public Blog() {

  }

  public long getId() {
    return Id;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public int getLikes() {
    return likes;
  }

  public void setId(long id) {
    Id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }
}
