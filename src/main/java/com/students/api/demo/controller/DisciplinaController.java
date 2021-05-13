package com.students.api.demo.controller;

import com.students.api.demo.service.DataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class DisciplinaController {

  private DataService dataService;

  public DisciplinaController(DataService dataService) {
    this.dataService = dataService;
  }
}
