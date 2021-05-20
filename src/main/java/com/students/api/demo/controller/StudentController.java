package com.students.api.demo.controller;

import com.students.api.demo.dto.NotaCompletDto;
import com.students.api.demo.dto.NotaDto;
import com.students.api.demo.repository.StudentRepository;
import com.students.api.demo.service.StudentDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

  private final StudentRepository studentRepository;
  private final StudentDataService studentDataService;

  public StudentController(
      StudentRepository studentRepository, StudentDataService studentDataService) {
    this.studentRepository = studentRepository;
    this.studentDataService = studentDataService;
  }

  @GetMapping("/note/anStudiu")
  public NotaDto getTipPersoana(
      @RequestParam(value = "idStudent", defaultValue = "1") int idStudent,
      @RequestParam(value = "tipNote", defaultValue = "activitate") String tipNota,
      @RequestParam(value = "idAnStudiu", defaultValue = "2") int idAnStudiu) {
   return studentDataService.getNoteForStudentByAnStudiu(idStudent, tipNota, idAnStudiu);
  }

  @GetMapping("/note/idDisciplina")
  public NotaCompletDto getTipPersoana(
          @RequestParam(value = "idStudent", defaultValue = "1") int idStudent,
          @RequestParam(value = "idDisciplina", defaultValue = "idDisciplina") int idDisciplina) {
    return studentDataService.getNoteForStudentByDisciplina(idStudent, idDisciplina);
  }
}
