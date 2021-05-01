package com.cisco.casemanager.model.vo;

import com.cisco.casemanager.model.eo.CaseEO;
import com.cisco.casemanager.model.eo.UserEO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;

    public static User fromEO(UserEO userEO) {
        return User.builder()
                .userId(userEO.getUserId())
                .firstName(userEO.getFirstName())
                .lastName(userEO.getLastName())
                .email(userEO.getEmail())
                .build();
    }
}
