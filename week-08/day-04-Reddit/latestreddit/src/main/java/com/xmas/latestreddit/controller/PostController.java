package com.xmas.latestreddit.controller;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xmas.latestreddit.model.Post;
import com.xmas.latestreddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("posts", postService.getAllByLikes());
    return "index";
  }

  @GetMapping("/add")
  public String addForm(Model model) {
    model.addAttribute("newpost", new Post());
    return "add";
  }

  @PostMapping("/add")
  public String addPost(@ModelAttribute Post post) {
    postService.savePost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/upvote")
  public String upvotePost(@PathVariable long id) {
    postService.upvote(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/downvote")
  public String downvotePost(@PathVariable long id) {
    postService.downvote(id);
    return "redirect:/";
  }
}
