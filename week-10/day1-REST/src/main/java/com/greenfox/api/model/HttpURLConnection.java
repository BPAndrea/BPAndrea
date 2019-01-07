package com.greenfox.api.model;

import java.net.URL;
import java.net.URLConnection;

public abstract class HttpURLConnection extends URLConnection {
  /**
   * Constructs a URL connection to the specified URL. A connection to
   * the object referenced by the URL is not created.
   *
   * @param url the specified URL.
   */
  protected HttpURLConnection(URL url) {
    super(url);
  }
}
