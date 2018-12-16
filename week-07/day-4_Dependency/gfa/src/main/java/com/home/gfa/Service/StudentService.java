package com.home.gfa.Service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
  public class StudentService {
    ArrayList<String> names;

    public StudentService() {
      names = new ArrayList<>();
      names.add("Sanyi");
      names.add("Lilla");
      names.add("John");
    }

    public List<String> findAll() {
      return names;
    }

    public void save(String student) {
      names.add(student);
    }

    public int getSize(){
      return names.size();
    }

    public boolean findStudent(String name){
      boolean isStudent = false;
      for (String item: names) {
        if (item.equals(name)){
          isStudent = true;
        }
      }
      return isStudent;
    }
  }
