package com.students.api.demo.service;

import com.students.api.demo.dto.NotePerDiscDto;
import com.students.api.demo.dto.NoteProfesorDto;
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
    public ArrayList<NotePerDiscDto> getNotePerDisc(Integer idProfesor, Integer idInstDisc) {

       Optional<Profesor> profesor = profesorRepository.findById(idProfesor);
        InstantaDisciplina instantaDisciplina =
                instantaDisciplinaRepository.findByIdAndProfesor(idInstDisc, profesor);

        final ArrayList<NotePerDiscDto> notePerDiscDtoList = new ArrayList<>();

        final List<NoteFinale> noteFinaleByInsDisc =
                noteFinaleRepository.findAllByInstantaDisciplina(Optional.ofNullable(instantaDisciplina));
        final List<NotaActivitate> notaActByInsDisc =
                noteActivitateRepository.findAllByInstantaDisciplina(Optional.ofNullable(instantaDisciplina));
        final List<NoteExamen> notaExByInsDisc =
                noteExamenRepository.findAllByInstantaDisciplina(Optional.ofNullable(instantaDisciplina));

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
        for (NotaActivitate notaActivitate : notaActByInsDisc) {
            NotePerDiscDto notePerDiscDto = new NotePerDiscDto();
            notePerDiscDto.setData(notaActivitate.getData());
            notePerDiscDto.setValoareNota(notaActivitate.getValoareNota());
            notePerDiscDto.setTipNota("NotaActivitate");
            notePerDiscDtoList.add(notePerDiscDto);
        }

        return notePerDiscDtoList;
    }


    // GET  /discipline/{idDisciplina}/noteProfesor
    //    // /profesor/{idProfesor}/note/disciplina=idDisciplina

    public ArrayList<NoteProfesorDto> getNoteProfesor(Integer idProfesor, Integer idInstDisc) {

        Optional<Profesor> profesor = profesorRepository.findById(idProfesor);
        InstantaDisciplina instantaDisciplina =
                instantaDisciplinaRepository.findByIdAndProfesor(idInstDisc, profesor);

        final ArrayList<NoteProfesorDto> noteProfesorDtoList = new ArrayList<>();


        final List<NoteFinale> noteFinaleByInsDisc =
                noteFinaleRepository.findAllByInstantaDisciplina(Optional.ofNullable(instantaDisciplina));
        final List<NotaActivitate> notaActByInsDisc =
                noteActivitateRepository.findAllByInstantaDisciplina(Optional.ofNullable(instantaDisciplina));
        final List<NoteExamen> notaExByInsDisc =
                noteExamenRepository.findAllByInstantaDisciplina(Optional.ofNullable(instantaDisciplina));

        for (NoteFinale notaFinala : noteFinaleByInsDisc) {
            NoteProfesorDto noteProfesorDto = new NoteProfesorDto();
            Student studentN = notaFinala.getStudent();
            Persoana numeStud = studentN.getPersoana();
            Persoana prenumeStud = studentN.getPersoana();
            noteProfesorDto.setNumeStud(numeStud.getNume());
            noteProfesorDto.setPrenumeStud(prenumeStud.getPrenume());
            noteProfesorDto.setData(notaFinala.getData());
            noteProfesorDto.setValoareNota(notaFinala.getMedieFinala());
            noteProfesorDto.setTipNota("Finala");
            noteProfesorDtoList.add(noteProfesorDto);
        }
        for (NoteExamen notaEx : notaExByInsDisc) {
            NoteProfesorDto noteProfesorDto = new NoteProfesorDto();
            Student studentN = notaEx.getStudent();
            Persoana numeStud = studentN.getPersoana();
            Persoana prenumeStud = studentN.getPersoana();
            noteProfesorDto.setNumeStud(numeStud.getNume());
            noteProfesorDto.setPrenumeStud(prenumeStud.getPrenume());
            noteProfesorDto.setData(notaEx.getData());
            noteProfesorDto.setValoareNota(notaEx.getValoareNota());
            noteProfesorDto.setTipNota("Examen");
            noteProfesorDtoList.add(noteProfesorDto);
        }

        for (NotaActivitate notaActivitate : notaActByInsDisc) {
            NoteProfesorDto noteProfesorDto = new NoteProfesorDto();
            Student studentN = notaActivitate.getStudent();
            Persoana numeStud = studentN.getPersoana();
            Persoana prenumeStud = studentN.getPersoana();
            noteProfesorDto.setNumeStud(numeStud.getNume());
            noteProfesorDto.setPrenumeStud(prenumeStud.getPrenume());
            noteProfesorDto.setData(notaActivitate.getData());
            noteProfesorDto.setValoareNota(notaActivitate.getValoareNota());
            noteProfesorDto.setTipNota("Activitate");
            noteProfesorDtoList.add(noteProfesorDto);
        }

        return noteProfesorDtoList;
    }

}
