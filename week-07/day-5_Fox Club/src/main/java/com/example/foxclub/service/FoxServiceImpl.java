package com.example.foxclub.service;

import com.example.foxclub.model.Fox;
import com.example.foxclub.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {
  private FoxRepository foxRepository;


  @Autowired
  public FoxServiceImpl(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  public FoxServiceImpl() {
  }

  @Override
  public void addFox(Fox fox) {
    foxRepository.save(fox);

  }

  @Override
  public Fox findFox(String name) {
    return foxRepository.findByName(name);
  }

  @Override
  public List<Fox> findAllFoxes() {
    return foxRepository.findAll();
  }


}




