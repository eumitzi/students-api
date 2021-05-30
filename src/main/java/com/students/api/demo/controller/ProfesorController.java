package com.students.api.demo.controller;

import com.students.api.demo.dto.NotePerDiscDto;
import com.students.api.demo.entity.NotaActivitate;
import com.students.api.demo.service.NoteActivitateService;
import com.students.api.demo.service.NoteExamenService;
import com.students.api.demo.service.NoteFinaleService;
import com.students.api.demo.service.ProfesorDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @PostMapping("/profesor/noteFinale")
    public ResponseEntity<String> insertNoteFin(
            //  String data, float notaExamen, float notaActivitate, float medieFinala, String nrMatricol, String numeDisciplina) {
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
            //  String data, float valoareNota, String nrMatricol, String numeDisciplina
            @RequestParam(value = "data", defaultValue = "1") String data,
            @RequestParam(value = "valoareNota", defaultValue = "3") float valoareNota,
            @RequestParam(value = "nrMatricol", defaultValue = "LMO121") String nrMatricol,
            @RequestParam(value = "numeDisciplina", defaultValue = "Programarea Concurenta") String numeDisciplina){
        noteExamenService.insertNoteExamen(data, valoareNota, nrMatricol, numeDisciplina);
        return new ResponseEntity<>("Inserted sucessfully!", HttpStatus.OK);
    }

}

