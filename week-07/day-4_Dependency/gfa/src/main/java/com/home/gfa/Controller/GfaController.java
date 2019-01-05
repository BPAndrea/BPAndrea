package com.home.gfa.Controller;

import com.home.gfa.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GfaController {
  private StudentService studentService;

  @Autowired
  public GfaController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/gfa")
  public String getMainPage(Model model) {
    model.addAttribute("number", studentService.getSize());
    return "main";
  }

  @GetMapping("/gfa/list")
  public String listAllStudents(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "list";
  }

  @GetMapping("/gfa/add")
  public String addStudent(Model model) {
    //model.addAttribute("students", studentService.findAll());
    return "add";
  }

  @PostMapping("/gfa/add")
  public String addStudent(@RequestParam("name") String name) {
    studentService.save(name);
    //model.addAttribute("students", studentService.findAll());
    return "redirect:/gfa/list";
  }
  @GetMapping("/gfa/check")
  public String checkStudent(@RequestParam(value="name", required=false ) String name, Model model) {
    if(name != null && name !="") {
      if (studentService.findStudent(name)) {
        model.addAttribute("finder", name + " is already our Student");
      } else {
        model.addAttribute("finder", name + " is not our student yet. Please register!");
      }
    } else  {
      model.addAttribute("finder", "Please give a name you are searching for!");
    }
    return "checker";
  }
}

