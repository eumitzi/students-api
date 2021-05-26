package com.students.api.demo.controller;

import com.students.api.demo.dto.NotaDto;
import com.students.api.demo.dto.NotePerDiscDto;
import com.students.api.demo.dto.NoteStudDisc;
import com.students.api.demo.repository.StudentRepository;
import com.students.api.demo.service.StudentDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentController {

  private final StudentRepository studentRepository;
  private final StudentDataService studentDataService;

  public StudentController(
      StudentRepository studentRepository, StudentDataService studentDataService) {
    this.studentRepository = studentRepository;
    this.studentDataService = studentDataService;
  }

  @CrossOrigin
  @GetMapping("/note/anStudiu")
  public ResponseEntity<ArrayList<NotaDto>> getTipPersoana(
      @RequestParam(value = "idStudent", defaultValue = "1") int idStudent,
      @RequestParam(value = "tipNote", defaultValue = "activitate") String tipNota,
      @RequestParam(value = "idAnStudiu", defaultValue = "2") int idAnStudiu) {
    final ArrayList<NotaDto> noteForStudentByAnStudiu = studentDataService.getNoteForStudentByAnStudiu(idStudent, tipNota, idAnStudiu);
    return new ResponseEntity<>(noteForStudentByAnStudiu, HttpStatus.OK);
  }

  @GetMapping("/note/idDisciplina")
  public ArrayList<NotePerDiscDto> getTipPersoana(
      @RequestParam(value = "idStudent", defaultValue = "1") int idStudent,
      @RequestParam(value = "idDisciplina", defaultValue = "idDisciplina") int idDisciplina) {
    final ArrayList<NotePerDiscDto> notePerDisc = studentDataService.getNotePerDisc(idStudent, idDisciplina);
    return notePerDisc;
  }

  @CrossOrigin
  @GetMapping("/testp")
  public ResponseEntity<List<NotePerDiscDto>> getNotePerDiscc(
      @RequestParam(value = "numeStudent", defaultValue = "test") String numeStudent,
      @RequestParam(value = "prenumeStudent", defaultValue = "test") String prenumeStudent,
      @RequestParam(value = "numeDisciplina", defaultValue = "test") String numeDisciplina) {

    ArrayList<NotePerDiscDto> notePerDiscStr =
        studentDataService.getNotePerDiscStr(numeStudent, prenumeStudent, numeDisciplina);
    return new ResponseEntity<>(notePerDiscStr, HttpStatus.OK);
  }
}
