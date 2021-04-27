package com.students.api.demo.controller;

import com.students.api.demo.repository.DisciplinaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class DisciplinaController {

    private DisciplinaRepository disciplinaRepository;

}
