package com.cisco.casemanager.model.repository;

import com.cisco.casemanager.model.eo.CaseEO;
import com.cisco.casemanager.model.eo.NoteEO;
import com.cisco.casemanager.model.eo.UserEO;
import com.cisco.casemanager.model.vo.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CaseRepository extends JpaRepository<CaseEO, Integer> {

    @Query(
            value = "SELECT c.* FROM cases c " +
                    "WHERE c.status = ?1 ",
            nativeQuery = true
    )
    List<CaseEO> findAllByStatus(String status);

    @Query(
            value = "SELECT c.* FROM cases c " +
                    "WHERE c.user_id = ?1 "+
                    "AND c.status = ?2 ",
            nativeQuery = true
    )
    List<CaseEO> findByUserIdAndStatus(Integer userId, String status);
}
