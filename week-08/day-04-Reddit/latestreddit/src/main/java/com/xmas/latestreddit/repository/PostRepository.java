package com.xmas.latestreddit.repository;

import com.xmas.latestreddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
 List<Post> findAllByOrderByLikesDesc();
 Post findAllById(long id);
}
