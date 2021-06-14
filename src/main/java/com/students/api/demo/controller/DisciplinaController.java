package com.students.api.demo.controller;

import com.students.api.demo.service.DataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class DisciplinaController {

  private DataService dataService;

  public DisciplinaController(DataService dataService) {
    this.dataService = dataService;
  }

  @GetMapping("/")
  @CrossOrigin
  public String getTipPersoana() {
    return "<a href=\"http://localhost:4200/discipline\">Website</a>";
  }
}
