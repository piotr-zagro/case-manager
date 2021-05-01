package com.cisco.casemanager.service;

import com.cisco.casemanager.model.eo.CaseEO;
import com.cisco.casemanager.model.eo.NoteEO;
import com.cisco.casemanager.model.eo.UserEO;
import com.cisco.casemanager.model.repository.CaseRepository;
import com.cisco.casemanager.model.repository.NoteRepository;
import com.cisco.casemanager.model.vo.Case;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CaseService {

    private final CaseRepository caseRepository;

    private final NoteService noteService;

    public void create(Case toCreate) {
        UserEO userEO = UserEO.builder()
                .firstName(toCreate.getUser().getFirstName())
                .lastName(toCreate.getUser().getLastName())
                .email(toCreate.getUser().getEmail())
                .build();

        CaseEO caseEO = CaseEO.builder()
                .title(toCreate.getTitle())
                .description(toCreate.getDescription())
                .severity(toCreate.getSeverity())
                .status(toCreate.getStatus())
                .user(userEO)
                .build();

        caseRepository.save(caseEO);

        toCreate.getNotes()
                .forEach(note -> {
                     noteService.addNote(note.getDetails(), caseEO);
                });

    }

    public List<Case> getCasesByUserIdAndStatus(Integer userId, Case.Status status) {
        List<CaseEO> cases;
        if(userId == null) {
            cases = caseRepository.findAllByStatus(status.toString());
        } else {
            cases = caseRepository.findByUserIdAndStatus(userId, status.toString());
        }

        return cases.stream()
                .map(this::mapCaseToVO)
                .collect(Collectors.toList());
    }

    private Case mapCaseToVO(CaseEO caseEO) {
        Case casee = Case.fromEO(caseEO);
        casee.setNotes(noteService.getNotesByCaseId(caseEO.getCaseId()));
        return casee;
    }

    public Case getCaseById(Integer caseId) {
        return mapCaseToVO(getCaseEOById(caseId));
    }

    public CaseEO getCaseEOById(Integer caseId) {
        return caseRepository.findById(caseId).orElseThrow(() -> new RuntimeException("Not found caseId"));
    }
}
