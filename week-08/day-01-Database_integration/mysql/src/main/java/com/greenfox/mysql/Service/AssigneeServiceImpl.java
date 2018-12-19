package com.greenfox.mysql.Service;

import com.greenfox.mysql.Model.Assignee;
import com.greenfox.mysql.Model.Todo;
import com.greenfox.mysql.Repository.AssigneeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImpl {
  AssigneeRepository assigneeRepository;

  public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  public List<Assignee> listAllAssignee() {
    List<Assignee> assignees = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignee -> assignees.add(assignee ));
    return assignees;
  }
  public void addAssignee(Assignee assignee) {
    if (assignee != null) {
      this.assigneeRepository.save(assignee);
    }
  }

}
