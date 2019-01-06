package com.xmas.sqlagain.controller;

import com.xmas.sqlagain.model.Item;
import com.xmas.sqlagain.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AssigneeController {
  private AssigneeService assigneeService;

  @Autowired
  public AssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping("/assignee")
  public String list(Model model) {
    model.addAttribute("assignees", assigneeService.findAll());
    return "assignee/assignee_list";
  }
}
