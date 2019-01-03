package com.greenfox.newreddit.Controller;


import com.greenfox.newreddit.Model.Post;
import com.greenfox.newreddit.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  private PostService postService;

  @Autowired
  public MainController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String getIndexPage(Model model) {
   //model.addAttribute("postList", postService.getPostList());
    model.addAttribute("postList", postService.bestPosts());
    return "index";
  }

  @GetMapping("/submit")
  public String getSubmitPage(Model model) {
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String submitNewPost(@ModelAttribute Post post) {
    postService.postSaver(post);
    return "redirect:/";
  }

  @GetMapping("/countInc/{id}")
  public String increasePostCount(@PathVariable Long id) {
    postService.countIncreaser(id);
    return "redirect:/";
  }

  @GetMapping("/countDesc/{id}")
  public String decreasePostCount(@PathVariable Long id) {
    postService.countDecreaser(id);
    return "redirect:/";
  }
}
