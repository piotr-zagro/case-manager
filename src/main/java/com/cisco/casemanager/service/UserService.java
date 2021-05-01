package com.cisco.casemanager.service;

import com.cisco.casemanager.model.eo.CaseEO;
import com.cisco.casemanager.model.eo.UserEO;
import com.cisco.casemanager.model.repository.CaseRepository;
import com.cisco.casemanager.model.repository.UserRepository;
import com.cisco.casemanager.model.vo.Case;
import com.cisco.casemanager.model.vo.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public void create(User toCreate) {
        UserEO userEO = UserEO.builder()
                .firstName(toCreate.getFirstName())
                .lastName(toCreate.getLastName())
                .email(toCreate.getEmail())
                .build();

        userRepository.save(userEO);
    }

    public boolean checkIfUserIdExists(Integer userId) {
         return userRepository.findById(userId).isPresent();
    }

    public void createIfNotExists(User toCreate) {
        if (checkIfUserIdExists(toCreate.getUserId())) {
            create(toCreate);
        }
    }
}
