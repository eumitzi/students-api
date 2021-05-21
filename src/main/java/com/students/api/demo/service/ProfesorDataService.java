package com.students.api.demo.service;

import com.students.api.demo.dto.NotePerDiscDto;
import com.students.api.demo.entity.*;
import com.students.api.demo.repository.*;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Transactional
public class ProfesorDataService {

    private StudentRepository studentRepository;
    private ProfesorRepository profesorRepository;
    private InstantaDisciplinaRepository instantaDisciplinaRepository;
    private NoteFinaleRepository noteFinaleRepository;
    private NoteActivitateRepository noteActivitateRepository;
    private NoteExamenRepository noteExamenRepository;
    private NoteRepository noteRepository;
    private AnStudiuRepository anStudiuRepository;
    private DisciplinaRepository disciplinaRepository;

    public ProfesorDataService(
            StudentRepository studentRepository,
            ProfesorRepository profesorRepository,
            InstantaDisciplinaRepository instantaDisciplinaRepository,
            NoteFinaleRepository noteFinaleRepository,
            AnStudiuRepository anStudiuRepository,
            NoteActivitateRepository noteActivitateRepository,
            NoteExamenRepository noteExamenRepository,
            NoteRepository noteRepository,
            DisciplinaRepository disciplinaRepository) {
        this.studentRepository = studentRepository;
        this.profesorRepository = profesorRepository;
        this.instantaDisciplinaRepository = instantaDisciplinaRepository;
        this.noteFinaleRepository = noteFinaleRepository;
        this.anStudiuRepository = anStudiuRepository;
        this.noteRepository = noteRepository;
        this.noteActivitateRepository = noteActivitateRepository;
        this.noteExamenRepository = noteExamenRepository;
        this.disciplinaRepository = disciplinaRepository;
    }

//    GET  /discipline/{idDisciplina}/note

    // /profesor/{idProfesor}/note/disciplina=idDisciplina
    public List<NotePerDiscDto> getNotePerDisc(Integer idProfesor, Integer idInstDisc) {

       Optional<Profesor> profesor = profesorRepository.findById(idProfesor);
        InstantaDisciplina instantaDisciplina =
                instantaDisciplinaRepository.findByIdAndProfesor(idInstDisc, profesor);

        final List<NotePerDiscDto> notePerDiscDtoList = new ArrayList<>();

        final List<NoteFinale> noteFinaleByInsDisc =
                noteFinaleRepository.findAllByInstantaDisciplina(instantaDisciplina);
        final List<NotaActivitate> notaActByInsDisc =
                noteActivitateRepository.findAllByInstantaDisciplina(instantaDisciplina);
        final List<NoteExamen> notaExByInsDisc =
                noteExamenRepository.findAllByInstantaDisciplina(instantaDisciplina);

        for (NoteFinale notaFinala : noteFinaleByInsDisc) {
            NotePerDiscDto notePerDiscDto = new NotePerDiscDto();
            notePerDiscDto.setData(notaFinala.getData());
            notePerDiscDto.setValoareNota(notaFinala.getMedieFinala());
            notePerDiscDto.setTipNota("NotaFinala");
            notePerDiscDtoList.add(notePerDiscDto);
        }
        for (NoteExamen notaEx : notaExByInsDisc) {
            NotePerDiscDto notePerDiscDto = new NotePerDiscDto();
            notePerDiscDto.setData(notaEx.getData());
            notePerDiscDto.setValoareNota(notaEx.getValoareNota());
            notePerDiscDto.setTipNota("NotaExamen");
            notePerDiscDtoList.add(notePerDiscDto);
        }
        for (NotaActivitate notaFinala : notaActByInsDisc) {
            NotePerDiscDto notePerDiscDto = new NotePerDiscDto();
            notePerDiscDto.setData(notaFinala.getData());
            notePerDiscDto.setValoareNota(notaFinala.getValoareNota());
            notePerDiscDto.setTipNota("NotaActivitate");
            notePerDiscDtoList.add(notePerDiscDto);
        }

        return notePerDiscDtoList;
    }}
