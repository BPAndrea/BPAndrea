package com.xmas.sqlagain.service;

import com.xmas.sqlagain.model.Assignee;
import com.xmas.sqlagain.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiveImpl implements AssigneeService {
  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiveImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> findAll() {
    return assigneeRepository.findAll();
  }
}
