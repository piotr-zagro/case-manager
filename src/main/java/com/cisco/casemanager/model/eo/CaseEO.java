package com.cisco.casemanager.model.eo;

import com.cisco.casemanager.model.vo.Case;
import com.cisco.casemanager.model.vo.Note;
import com.cisco.casemanager.model.vo.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "cases")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaseEO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer caseId;

    private String title;

    private String description;

    private Integer severity;

    private Case.Status status;

    @ManyToOne
    private UserEO user;
}
