package com.example.foxclub.service;


import com.example.foxclub.model.Fox;

import java.util.List;

public interface FoxService {

  void addFox(Fox fox);

  Fox findFox(String name);

  List<Fox> findAllFoxes();


}
