package com.students.api.demo.controller;

import com.students.api.demo.dto.NotePerDiscDto;
import com.students.api.demo.entity.NotaActivitate;
import com.students.api.demo.service.NoteActivitateService;
import com.students.api.demo.service.ProfesorDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/profesor")
@CrossOrigin
public class ProfesorController {

    private ProfesorDataService profesorDataService;
    private NoteActivitateService noteActivitateService;

    public ProfesorController(ProfesorDataService profesorDataService, NoteActivitateService noteActivitateService){
        this.profesorDataService = profesorDataService;
        this.noteActivitateService = noteActivitateService;
    }

    @GetMapping("/note/idDisciplina")
    public ResponseEntity<ArrayList<NotePerDiscDto>> getTipPersoana(
            @RequestParam(value = "idProfesor", defaultValue = "1") int idProfesor,
            @RequestParam(value = "idDisciplina", defaultValue = "idDisciplina") int idDisciplina) {
        final ArrayList<NotePerDiscDto> notePerDisc = profesorDataService.getNotePerDisc(idProfesor, idDisciplina);
        return new ResponseEntity<>(notePerDisc, HttpStatus.OK);
    }

    @PostMapping("/profesor/noteActivitate")
    public ResponseEntity<String> insertNoteActiv(
            //  String data, float valoareNota, String nrMatricol, String numeDisciplina
            @RequestParam(value = "data", defaultValue = "1") String data,
            @RequestParam(value = "valoareNota", defaultValue = "2") float valoareNota,
            @RequestParam(value = "nrMatricol", defaultValue = "LMO121") String nrMatricol,
            @RequestParam(value = "numeDisciplina", defaultValue = "Programarea Concurenta") String numeDisciplina){
        noteActivitateService.insertNoteActivitate(data, valoareNota, nrMatricol, numeDisciplina);
        return new ResponseEntity<>("Inserted sucessfully!", HttpStatus.OK);
    }
}

