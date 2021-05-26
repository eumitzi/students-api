package com.students.api.demo.controller;

import com.students.api.demo.dto.NotePerDiscDto;
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

    public ProfesorController(ProfesorDataService profesorDataService){
        this.profesorDataService = profesorDataService;
    }

    @GetMapping("/note/idDisciplina")
    public ResponseEntity<ArrayList<NotePerDiscDto>> getTipPersoana(
            @RequestParam(value = "idProfesor", defaultValue = "1") int idProfesor,
            @RequestParam(value = "idDisciplina", defaultValue = "idDisciplina") int idDisciplina) {
        final ArrayList<NotePerDiscDto> notePerDisc = profesorDataService.getNotePerDisc(idProfesor, idDisciplina);
        return new ResponseEntity<>(notePerDisc, HttpStatus.OK);
    }
}

