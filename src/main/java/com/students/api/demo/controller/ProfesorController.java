package com.students.api.demo.controller;

import com.students.api.demo.dto.NoteProfesorDto;
import com.students.api.demo.service.NoteActivitateService;
import com.students.api.demo.service.NoteExamenService;
import com.students.api.demo.service.NoteFinaleService;
import com.students.api.demo.service.ProfesorDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/profesor")
@CrossOrigin
public class ProfesorController {

    private ProfesorDataService profesorDataService;
    private NoteActivitateService noteActivitateService;
    private NoteFinaleService noteFinaleService;
    private NoteExamenService noteExamenService;

    public ProfesorController(ProfesorDataService profesorDataService, NoteActivitateService noteActivitateService,
                              NoteFinaleService noteFinaleService, NoteExamenService noteExamenService){
        this.profesorDataService = profesorDataService;
        this.noteActivitateService = noteActivitateService;
        this.noteFinaleService = noteFinaleService;
        this.noteExamenService = noteExamenService;
    }

    @GetMapping("/noteActivitate/idDisciplina")
    public ResponseEntity<ArrayList<NoteProfesorDto>> getNoteActivitate(
            @RequestParam(value = "idProfesor", defaultValue = "idProfesor") int idProfesor,
            @RequestParam(value = "idDisciplina", defaultValue = "idDisciplina") int idDisciplina) {
        final ArrayList<NoteProfesorDto> noteProfesor = profesorDataService.getNoteActivitateProfesor(idProfesor, idDisciplina);
        return new ResponseEntity<>(noteProfesor, HttpStatus.OK);
    }

    @GetMapping("/noteExamen/idDisciplina")
    public ResponseEntity<ArrayList<NoteProfesorDto>> getNoteExamen(
            @RequestParam(value = "idProfesor", defaultValue = "idProfesor") int idProfesor,
            @RequestParam(value = "idDisciplina", defaultValue = "idDisciplina") int idDisciplina) {
        final ArrayList<NoteProfesorDto> noteProfesor = profesorDataService.getNoteExamenProfesor(idProfesor, idDisciplina);
        return new ResponseEntity<>(noteProfesor, HttpStatus.OK);
    }

    @GetMapping("/noteFinale/idDisciplina")
    public ResponseEntity<ArrayList<NoteProfesorDto>> getNoteFinale(
            @RequestParam(value = "idProfesor", defaultValue = "idProfesor") int idProfesor,
            @RequestParam(value = "idDisciplina", defaultValue = "idDisciplina") int idDisciplina) {
        final ArrayList<NoteProfesorDto> noteProfesor = profesorDataService.getNoteFinaleProfesor(idProfesor, idDisciplina);
        return new ResponseEntity<>(noteProfesor, HttpStatus.OK);
    }

    @PostMapping("/profesor/noteActivitate")
    public ResponseEntity<String> insertNoteActiv(
            @RequestParam(value = "data", defaultValue = "1") String data,
            @RequestParam(value = "valoareNota", defaultValue = "2") float valoareNota,
            @RequestParam(value = "nrMatricol", defaultValue = "LMO121") String nrMatricol,
            @RequestParam(value = "numeDisciplina", defaultValue = "Programarea Concurenta") String numeDisciplina){
        noteActivitateService.insertNoteActivitate(data, valoareNota, nrMatricol, numeDisciplina);
        return new ResponseEntity<>("Inserted sucessfully!", HttpStatus.OK);
    }

    @PostMapping("/profesor/noteFinale")
    public ResponseEntity<String> insertNoteFin(
            @RequestParam(value = "data", defaultValue = "1") String data,
            @RequestParam(value = "notaExamen", defaultValue = "10") float notaExamen,
            @RequestParam(value = "notaActivitate", defaultValue = "10") float notaActivitate,
            @RequestParam(value = "medieFinala", defaultValue = "10") float medieFinala,
            @RequestParam(value = "nrMatricol", defaultValue = "LMO121") String nrMatricol,
            @RequestParam(value = "numeDisciplina", defaultValue = "Programarea Concurenta") String numeDisciplina){
        noteFinaleService.insertNoteFinale(data, notaExamen, notaActivitate, medieFinala, nrMatricol, numeDisciplina);
        return new ResponseEntity<>("Inserted sucessfully!", HttpStatus.OK);
    }

    @PostMapping("/profesor/noteExamen")
    public ResponseEntity<String> insertNoteExam(
            @RequestParam(value = "data", defaultValue = "1") String data,
            @RequestParam(value = "valoareNota", defaultValue = "3") float valoareNota,
            @RequestParam(value = "nrMatricol", defaultValue = "LMO121") String nrMatricol,
            @RequestParam(value = "numeDisciplina", defaultValue = "Programarea Concurenta") String numeDisciplina){
        noteExamenService.insertNoteExamen(data, valoareNota, nrMatricol, numeDisciplina);
        return new ResponseEntity<>("Inserted sucessfully!", HttpStatus.OK);
    }


}

