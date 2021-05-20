package com.students.api.demo;

import com.students.api.demo.dto.NotaDto;
import com.students.api.demo.entity.DisciplinaGeneral;
import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.Profesor;
import com.students.api.demo.service.DataService;
import com.students.api.demo.service.StudentDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ApplicationTests {

  @Autowired 
  private DataService dataService;

  @Autowired
  private StudentDataService studentDataService;

  @Test
  void contextLoads() {}

  @Test
  void testDisciplinaGeneral() {
    Optional<DisciplinaGeneral> test = dataService.test();
  }

  @Test
  void testInstantaDisciplina() {

    Optional<InstantaDisciplina> test = dataService.testInst();
  }

  @Test
  void testProfesor() {
    Optional<Profesor> test = dataService.testProf();
  }

  @Test
  void testInstDiscStud() {
    List<InstantaDisciplina> test = dataService.testStudent();
  }

  @Test
  void testNoteStudAndStud() {
    final NotaDto activitate = studentDataService.getNoteForStudentByAnStudiu(2, "activitate", 2);
  }
}
