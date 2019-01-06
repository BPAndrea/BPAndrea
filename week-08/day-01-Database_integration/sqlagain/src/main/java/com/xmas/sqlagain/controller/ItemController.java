package com.xmas.sqlagain.controller;

import com.xmas.sqlagain.model.Item;
import com.xmas.sqlagain.service.AssigneeService;
import com.xmas.sqlagain.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ItemController {
  private ItemService itemService;
  private AssigneeService assigneeService;

  @Autowired
  public ItemController(ItemService itemService, AssigneeService assigneeService) {
    this.itemService = itemService;
    this.assigneeService = assigneeService;
  }

  @GetMapping({"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    model.addAttribute("item", new Item());
    if (isActive) {
      model.addAttribute("items", itemService.getActive());
    } else {
      model.addAttribute("items", itemService.getAll());
    }
    return "item/index";
  }

  @GetMapping("/add")
  public String addForm(Model model) {
    model.addAttribute("item", new Item());
    return "item/add";
  }

  @PostMapping("/add")
  public String addElement(@ModelAttribute Item item) {
    itemService.addItem(item);
    return "redirect:/";
  }

  @GetMapping("/{id}/delete")
  public String deleteElement(@PathVariable long id) {
    itemService.deleteItemById(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String getItem(@PathVariable long id, Model model) {
    model.addAttribute("item", itemService.findById(id));
    return "item/edit_item";
  }

  @PostMapping("/{id}/edit")
  public String updateItem(@ModelAttribute Item item) {
    itemService.updateItem(item);
    return "redirect:/";
  }

  @GetMapping("/{id}/item")
  public String showItem(@PathVariable long id, Model model) {
    model.addAttribute("item", itemService.findById(id));
    return "item/item";
  }

  @PostMapping("/todo/search")
  public String searchTodo(@RequestParam("name") String name, Model model) {
    List<Item> result = itemService.findByNameOrDescription(name);
    if (result.size() == 0) {
      model.addAttribute("queryResult", "No todos found with the given name (title or description)");
    } else {
      model.addAttribute("queryResult", name + " was found in the Todo list:");
      model.addAttribute("foundItems", result);
    }
    return "item/search";
  }
}
