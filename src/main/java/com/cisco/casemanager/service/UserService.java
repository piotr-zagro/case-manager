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

    public UserEO create(User toCreate) {
        UserEO userEO = UserEO.builder()
                .firstName(toCreate.getFirstName())
                .lastName(toCreate.getLastName())
                .email(toCreate.getEmail())
                .build();

        userRepository.save(userEO);

        return userEO;
    }

    public UserEO getUserById(Integer userId) {
         return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("Not found caseId"));
    }

    public UserEO createIfNotExists(User toCreate) {
        UserEO userEO;
        try {
            userEO = getUserById(toCreate.getUserId());
        } catch (RuntimeException e) {
            userEO = create(toCreate);
        }

        return userEO;
    }
}
