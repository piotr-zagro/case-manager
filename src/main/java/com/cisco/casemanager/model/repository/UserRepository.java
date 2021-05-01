package com.cisco.casemanager.model.repository;

import com.cisco.casemanager.model.eo.UserEO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEO, Integer> {
}
