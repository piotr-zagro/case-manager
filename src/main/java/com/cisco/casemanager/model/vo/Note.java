package com.cisco.casemanager.model.vo;

import com.cisco.casemanager.model.eo.NoteEO;
import com.cisco.casemanager.model.eo.UserEO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Note {
    private Integer noteId;
    private Integer caseId;
    private String details;

    public static Note fromEO(NoteEO noteEO) {
        return Note.builder()
                .noteId(noteEO.getNoteId())
                .caseId(noteEO.getCaseEo().getCaseId())
                .details(noteEO.getDetails())
                .build();
    }
}
