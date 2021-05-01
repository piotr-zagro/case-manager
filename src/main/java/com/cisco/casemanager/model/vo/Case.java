package com.cisco.casemanager.model.vo;

import com.cisco.casemanager.model.eo.CaseEO;
import com.cisco.casemanager.model.eo.NoteEO;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class Case {
    private Integer caseId;
    private String title;
    private String description;
    private Integer severity;
    private Status status;
    private User user;
    private List<Note> notes;

    @ToString
    public enum Status {
        OPEN,
        CLOSED
    }

    public static Case fromEO(CaseEO caseEO) {
        return Case.builder()
                .caseId(caseEO.getCaseId())
                .title(caseEO.getTitle())
                .description(caseEO.getDescription())
                .severity(caseEO.getSeverity())
                .status(caseEO.getStatus())
                .user(User.fromEO(caseEO.getUser()))
                .build();
    }
}
