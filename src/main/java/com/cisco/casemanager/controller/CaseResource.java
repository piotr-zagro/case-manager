package com.cisco.casemanager.controller;

import com.cisco.casemanager.model.vo.Case;
import com.cisco.casemanager.model.vo.Note;
import com.cisco.casemanager.model.vo.User;
import com.cisco.casemanager.service.CaseService;
import com.cisco.casemanager.service.NoteService;
import com.cisco.casemanager.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class CaseResource {

    private final CaseService caseService;

    private final NoteService noteService;

    @GetMapping("/cases/status/{status}")
    List<Case> getCasesWithStatus(@PathVariable Case.Status status) {
        // TODO: Query for cases with a specified status.
        return caseService.getCasesByUserIdAndStatus(null, status);
    }
    @GetMapping("/cases/user/{userId}")
    List<Case> getOpenCases(@PathVariable Integer userId) {
        // TODO: Query for cases with a userId;
        return caseService.getCasesByUserIdAndStatus(userId, Case.Status.OPEN);
    }
    @GetMapping("/cases/user/{userId}/status/{status}")
    List<Case> getOpenCases(@PathVariable Integer userId, @PathVariable
            Case.Status status) {
        // TODO: Query for cases with a userId and status
        return caseService.getCasesByUserIdAndStatus(userId, status);
    }
    @GetMapping("/case/{caseId}")
    Case getCase(@PathVariable Integer caseId) {
        // TODO: Get a case by ID
        return caseService.getCaseById(caseId);
    }
    @PostMapping(value = "/case/create", consumes = "application/json")
    Case createCase(@RequestBody Case toCreate) {
        // TODO: Create a case and any associated records (user, notes)
        caseService.create(toCreate);
        return toCreate;
    }
    @PostMapping(value = "/case/{caseId}/addNote", consumes = "text/plain")
    Note addNote(@PathVariable Integer caseId, @RequestBody String detail) {
        // TODO: Create a note for the specified case
        return noteService.addNote(detail, caseId);
    }
}
