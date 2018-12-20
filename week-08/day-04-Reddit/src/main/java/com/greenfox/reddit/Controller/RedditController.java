package com.greenfox.reddit.Controller;

import com.greenfox.reddit.Service.RedditServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedditController {
  private RedditServiceImpl redditServiceImpl;

  @Autowired
  public RedditController(RedditServiceImpl redditServiceImpl) {
    this.redditServiceImpl = redditServiceImpl;
  }

  @GetMapping("/")
  public String listPosts(Model model) {
    model.addAttribute("blogs", redditServiceImpl.listAllBlogs());
  return "index";
  }
}
