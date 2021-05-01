package com.cisco.casemanager.model.repository;

import com.cisco.casemanager.model.eo.CaseEO;
import com.cisco.casemanager.model.eo.NoteEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoteRepository extends JpaRepository<NoteEO, Integer> {

    @Query(
            value = "SELECT n.* FROM notes n " +
                    "WHERE n.case_id = ?1 ",
            nativeQuery = true
    )
    List<NoteEO> findAllByCaseId(Integer caseId);

}
