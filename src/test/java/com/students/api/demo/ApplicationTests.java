package com.students.api.demo;

import com.students.api.demo.dto.NotaDto;
import com.students.api.demo.dto.NotePerDiscDto;
import com.students.api.demo.entity.*;
import com.students.api.demo.repository.InstantaDisciplinaRepository;
import com.students.api.demo.repository.PersoaneRepository;
import com.students.api.demo.repository.StudentRepository;
import com.students.api.demo.service.DataService;
import com.students.api.demo.service.NoteActivitateService;
import com.students.api.demo.service.StudentDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ApplicationTests {

  @Autowired private DataService dataService;

  @Autowired private StudentDataService studentDataService;

  @Autowired private InstantaDisciplinaRepository instantaDisciplinaRepository;

  @Autowired private StudentRepository studentRepository;

  @Autowired private PersoaneRepository persoaneRepository;
  @Autowired private NoteActivitateService noteActivitateService;

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
    final List<NotaDto> activitate =
        studentDataService.getNoteForStudentByAnStudiu(2, "activitate", 2);
  }

  @Test
  void testNoteExStudAndStud() {
    final List<NotaDto> activitate = studentDataService.getNoteForStudentByAnStudiu(2, "examen", 2);
  }

  @Test
  void testNoteFinStudAndStud() {
    final List<NotaDto> activitate = studentDataService.getNoteForStudentByAnStudiu(1, "finala", 1);
  }

  @Test
  void testNoteStudAndDiscc() {
    final Optional<Student> byId = studentRepository.findById(1);
    final InstantaDisciplina activitate = instantaDisciplinaRepository.findByIdAndStudent(1, byId);
  }

  @Test
  void testNoteStudAndDisccc() {
    final List<NotePerDiscDto> activitate = studentDataService.getNotePerDisc(1, 1);
  }

  @Test
  void testNoteStudAndDisccic() {
    final Optional<Persoana> pers = persoaneRepository.findByNumeAndPrenume("Matei", "Denisa");
  }

  @Test
  void testNoteActivitateInsertion() {
    noteActivitateService.insertNoteActivitate(
        "2021-05-27", 10, "LM032", "Programarea Concurenta");
  }
}
