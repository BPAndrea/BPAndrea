package com.greenfox.api.service;

import com.greenfox.api.model.Log;
import com.greenfox.api.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
  private LogRepository logRepository;
  private List<Log> entries;
  private int entry_count;

  @Autowired
  public MainServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }



  @Override
  public void saveLog(Log log) {
    logRepository.save(log);
  }

  public List<Log> getEntries() {
    return logRepository.findAll();
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return logRepository.findAll().size();
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }
}
