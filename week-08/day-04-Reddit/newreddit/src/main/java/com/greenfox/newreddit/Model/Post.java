package com.greenfox.newreddit.Model;

import javax.persistence.*;
import javax.xml.soap.Text;
import java.time.LocalDateTime;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(columnDefinition = "TEXT")
  private String title;
  private String url;
  private Integer count;
  private LocalDateTime timestamp;

  public Post() {
    this.count = 1;
    this.timestamp = LocalDateTime.now();
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    this.count = 1;
    this.timestamp = LocalDateTime.now();
  }

  public Post(String title) {
    this.title = title;
    this.url = "";
    this.count = 1;
    this.timestamp = LocalDateTime.now();
  }
  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getUrl() {
    return url;
  }

  public Integer getCount() {
    return count;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }
}


