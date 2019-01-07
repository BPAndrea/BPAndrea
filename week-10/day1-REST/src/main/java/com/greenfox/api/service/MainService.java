package com.greenfox.api.service;

import com.greenfox.api.model.Log;

import java.util.List;

public interface MainService {
  List<Log> getAllLogs();

  void saveLog(Log log);
}
