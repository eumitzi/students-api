package com.students.api.demo.repository;

import com.students.api.demo.dto.NoteDto;
import com.students.api.demo.entity.Note;
import com.students.api.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    ///profesor/{idProfesor}/note

//    @Transactional
//    public void insereazaNota(NoteDto noteDto){
//        Note note = new Note();
//        //note.setTip_nota();
//    }
}
