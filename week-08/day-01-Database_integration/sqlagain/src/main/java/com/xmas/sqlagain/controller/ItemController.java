package com.xmas.sqlagain.controller;

import com.xmas.sqlagain.model.Item;
import com.xmas.sqlagain.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ItemController {
  private ItemService itemService;

  @Autowired
  public ItemController(ItemService itemService) {
    this.itemService = itemService;
  }

  @GetMapping("/")
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("items", itemService.getActive());
    } else {
      model.addAttribute("items", itemService.getAll());
    }
    return "index";
  }

  @GetMapping("/add")
  public String addForm(Model model) {
    model.addAttribute("item", new Item());
    return "add";
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
}
