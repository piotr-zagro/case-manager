package com.cisco.casemanager.service;

import com.cisco.casemanager.model.eo.CaseEO;
import com.cisco.casemanager.model.eo.NoteEO;
import com.cisco.casemanager.model.eo.UserEO;
import com.cisco.casemanager.model.repository.CaseRepository;
import com.cisco.casemanager.model.repository.NoteRepository;
import com.cisco.casemanager.model.repository.UserRepository;
import com.cisco.casemanager.model.vo.Note;
import com.cisco.casemanager.model.vo.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;

    private final CaseRepository caseRepository;

    public List<Note> getNotesByCaseId(Integer caseId) {
        return noteRepository.findAllByCaseId(caseId).stream()
                .map(Note::fromEO)
                .collect(Collectors.toList());
    }

    public Note addNote(String details, CaseEO caseEO) {
        NoteEO noteEO = NoteEO.builder()
                .details(details)
                .caseEo(caseEO)
                .build();

        noteRepository.save(noteEO);

        return Note.fromEO(noteEO);
    }

    public Note addNote(String details, Integer caseId) {
        CaseEO caseEO = caseRepository.findById(caseId).orElseThrow(() -> new RuntimeException("Not found caseId"));
        return addNote(details, caseEO);
    }
}
