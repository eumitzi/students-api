package com.students.api.demo.dto;

import com.students.api.demo.entity.NotaActivitate;
import com.students.api.demo.entity.NoteExamen;
import com.students.api.demo.entity.NoteFinale;

import java.util.List;
import java.util.Map;

public class NotaCompletDto {

  private Map<Float, String> notaActivitateData;
  private Map<Float, String> noteExamenData;
  private Map<Float, String> noteFinalaData;

  public Map<Float, String> getNotaActivitateData() {
    return notaActivitateData;
  }

  public void setNotaActivitateData(Map<Float, String> notaActivitateData) {
    this.notaActivitateData = notaActivitateData;
  }

  public Map<Float, String> getNoteExamenData() {
    return noteExamenData;
  }

  public void setNoteExamenData(Map<Float, String> noteExamenData) {
    this.noteExamenData = noteExamenData;
  }

  public Map<Float, String> getNoteFinalaData() {
    return noteFinalaData;
  }

  public void setNoteFinalaData(Map<Float, String> noteFinalaData) {
    this.noteFinalaData = noteFinalaData;
  }

}
