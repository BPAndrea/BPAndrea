package com.greenfox.newreddit.Service;

import com.greenfox.newreddit.Model.Post;
import com.greenfox.newreddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
  private PostRepository postRepository;

  @Autowired
  PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> getPostList() {
    return postRepository.findAll();
  }

  @Override
  public void countIncreaser(Long id) {
    Post post = postRepository.findAllById(id);
    post.setCount(post.getCount() + 1);
    postRepository.save(post);
  }

  @Override
  public void countDecreaser(Long id) {
    Post post = postRepository.findAllById(id);
    if (post.getCount() > 0) {
      post.setCount(post.getCount() - 1);
    }
    postRepository.save(post);
  }


  @Override
  public void postSaver(Post post) {
    postRepository.save(post);
  }

  @Override
  public List<Post> bestPosts() {
    return postRepository.findAllByOrderByCountDesc();
  }

}
