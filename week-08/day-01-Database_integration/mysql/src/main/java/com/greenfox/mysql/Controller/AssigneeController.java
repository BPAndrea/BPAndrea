package com.greenfox.mysql.Controller;

import com.greenfox.mysql.Model.Assignee;
import com.greenfox.mysql.Model.Todo;
import com.greenfox.mysql.Service.AssigneeServiceImpl;
import com.greenfox.mysql.Service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class AssigneeController {
  private AssigneeServiceImpl assigneeService;

  @Autowired
  public AssigneeController(AssigneeServiceImpl assigneeService) {
    this.assigneeService = assigneeService;
  }
  @GetMapping("todo/assign")
  public String listAssignee(Model model) {
    model.addAttribute("assignees", assigneeService.listAllAssignee());
    return "assignees";
  }

  @GetMapping("/todo/addassignee")
  public String addAssignee(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "add-assignee";
  }

  @PostMapping("/todo/addassignee")
  public String saveAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.addAssignee(assignee);
     return "redirect:/todo/assign";
  }
  @GetMapping("/todo/assign/{id}/delete")
  public String deleteAssignee(@PathVariable long id) {
    assigneeService.delete(id);
    return "redirect:/todo/assign";
  }

 @GetMapping("/todo/assign/{id}/edit")
  public String editAssignee(@PathVariable long id, Model model) {
    model.addAttribute("assignee", assigneeService.findAssignee(id));
    return "edit-assignee";
  }

  @PostMapping("/todo/assign/{id}/edit")
  public String editElement(@ModelAttribute Assignee assignee) {
    assigneeService.addAssignee(assignee);
    return "redirect:/todo/assign";
  }
}




