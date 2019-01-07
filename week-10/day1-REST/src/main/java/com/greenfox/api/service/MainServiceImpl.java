package com.greenfox.api.service;

import com.greenfox.api.model.Log;
import com.greenfox.api.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
  private LogRepository logRepository;

  @Autowired
  public MainServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public List<Log> getAllLogs() {
    return logRepository.findAll();
  }

  @Override
  public void saveLog(Log log) {
    logRepository.save(log);
  }
}
