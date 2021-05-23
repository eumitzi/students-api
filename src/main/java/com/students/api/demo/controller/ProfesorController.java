package com.students.api.demo.controller;

import com.students.api.demo.dto.NotePerDiscDto;
import com.students.api.demo.service.ProfesorDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    private ProfesorDataService profesorDataService;

    public ProfesorController(ProfesorDataService profesorDataService){
        this.profesorDataService = profesorDataService;
    }

    @GetMapping("/note/idDisciplina")
    public List<NotePerDiscDto> getTipPersoana(
            @RequestParam(value = "idProfesor", defaultValue = "1") int idProfesor,
            @RequestParam(value = "idDisciplina", defaultValue = "idDisciplina") int idDisciplina) {
        return profesorDataService.getNotePerDisc(idProfesor, idDisciplina);
    }
}
