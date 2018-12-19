package com.greenfox.finder.repository;

import com.greenfox.finder.model.User;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository {

  List<User> findAll();


}





